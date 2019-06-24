package task;

import task.controller.ConsoleHandler;
import task.controller.HumanHandler;
import task.dao.BetDao;
import task.dao.BetDaoImpl;
import task.dao.HumanDao;
import task.dao.HumanDaoImpl;
import task.lib.Injector;

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
        BetDao betDao = new BetDaoImpl();
        System.out.println(betDao.getAll());
        System.out.println("Объявите всех постаквивших, введите \n" +
                "имя и возраст через пробел. \n" +
                "Чтобы закончить ввод введите \":)\"");
        HumanHandler.handler();
        HumanDao humanDao = new HumanDaoImpl();
        System.out.println(humanDao.getAll());

    }


}




