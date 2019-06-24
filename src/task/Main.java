package task;

import task.controller.ConsoleHandler;
import task.dao.BetDao;
import task.dao.BetDaoImpl;
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
        System.out.println("Если хотите сделать ставку, введите \n" +
                "сумму и риск через пробел");
        ConsoleHandler.handle();
        BetDao betDao = new BetDaoImpl();
        System.out.println(betDao.getAll());

    }


}




