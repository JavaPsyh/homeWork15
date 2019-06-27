package task.factory;

import task.dao.GeneralizedDao;
import task.dao.BetDaoImpl;
import task.model.Bet;

public class BetDaoFactory {

    private static GeneralizedDao<Bet> instance;

    public static GeneralizedDao<Bet> getBetDao() {
        if (instance == null) {
            instance = new BetDaoImpl();
        }
        return instance;
    }
}
