package task.controller;

import task.dao.GeneralizedDao;
import task.lib.Inject;
import task.model.Bet;

public class ConsoleHandler {

    @Inject
    private static GeneralizedDao<Bet> betDao;

    static public void handle() {
        int number = 4;
        while (true) {
            if (number == 0) {
                return;
            }
            String string = (number * 100) + " " + ((double) number / 10);
            number--;
            String[] data = string.split(" ");
            try {
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                betDao.add(bet);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

    }
}

