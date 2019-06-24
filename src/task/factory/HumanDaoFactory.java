package task.factory;

import task.dao.HumanDao;
import task.dao.HumanDaoImpl;

public class HumanDaoFactory {

    private static HumanDao instance;

    public static HumanDao getInstance() {
        if (instance == null) {
            instance = new HumanDaoImpl();
        }
        return instance;
    }
}
