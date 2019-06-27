package task.factory;

import task.dao.GeneralizedDao;
import task.dao.HumanDaoImpl;
import task.model.Human;

public class HumanDaoFactory {

    private static GeneralizedDao<Human> instance;

    public static GeneralizedDao<Human> getInstance() {
        if (instance == null) {
            instance = new HumanDaoImpl();
        }
        return instance;
    }
}
