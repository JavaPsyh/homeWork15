package task.controller;

import task.dao.BetDao;
import task.dao.BetDaoImpl;
import task.factory.BetDaoFactory;
import task.lib.Inject;
import task.model.Bet;

import java.util.Scanner;

public class ConsoleHandler {

    @Inject
    private static BetDao betDao;

    static public void handle() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                betDao.add(bet);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Данные введены некорректно");
        }
    }
}

