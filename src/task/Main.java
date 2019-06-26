package task;

import task.controller.ConsoleHandler;
import task.controller.HumanHandler;
import task.dao.GeneralizedDao;
import task.dao.BetDaoImpl;
import task.dao.HumanDaoImpl;
import task.lib.Injector;
import task.model.Bet;
import task.model.Human;

public class Main {

    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Мы имеем следующие ставки:");
        ConsoleHandler.handle();
        GeneralizedDao<Bet> betDao = new BetDaoImpl();
        System.out.println(betDao.getAll());
        System.out.println("Объявите всех поставивших, введите \n" +
                "имя и возраст через пробел. \n" +
                "Чтобы закончить ввод введите \":)\"");
        HumanHandler.handler();
        GeneralizedDao<Human> humanDao = new HumanDaoImpl();
        System.out.println(humanDao.getAll());

    }


}




