package task.controller;

import task.dao.HumanDao;
import task.lib.Inject;
import task.model.Human;

import java.util.Scanner;

public class HumanHandler {

    @Inject
    private static HumanDao humanDao;

    public static void handler() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine();
                if (input.equals(":)")) {
                    return;
                }
                String[] strings = input.split(" ");
                Human human = new Human(strings[0], Integer.parseInt(strings[1]));
                humanDao.add(human);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Wrong input.");
        }
    }
}
