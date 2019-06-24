package task.lib;

import task.controller.ConsoleHandler;
import task.controller.HumanHandler;
import task.dao.BetDaoImpl;
import task.dao.HumanDaoImpl;
import task.factory.BetDaoFactory;
import task.factory.HumanDaoFactory;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoImpl> betDaoImplClass = BetDaoImpl.class;
        Class<HumanHandler> humanHandlerClass = HumanHandler.class;
        Class<HumanDaoImpl> humanDaoImplClass = HumanDaoImpl.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                if (betDaoImplClass.getDeclaredAnnotation(Dao.class) != null) {
                    field.setAccessible(true);
                    field.set(null, BetDaoFactory.getBetDao());
                }
            }
        }

        Field[] humanHandlerFields = humanHandlerClass.getDeclaredFields();
        for (Field field : humanHandlerFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                if (humanDaoImplClass.getDeclaredAnnotation(Dao.class) != null) {
                    field.setAccessible(true);
                    field.set(null, HumanDaoFactory.getInstance());
                }
            }
        }
    }
}
