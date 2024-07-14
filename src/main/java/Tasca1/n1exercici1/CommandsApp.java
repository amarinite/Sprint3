package Tasca1.n1exercici1;

import java.util.Scanner;

public class CommandsApp {
    private final Scanner scanner = new Scanner(System.in);
    Undo undo = Undo.getInstance();

    public void run() {
        int option = 0;
        String command = "";

        do {
            option = displayMenu();

            switch (option) {
                case 1:
                    undo.addCommand();
                    break;
                case 2:
                    undo.removeCommand();
                    break;
                case 3:
                    undo.listCommands();
                    break;
                case 4:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid action number.");
                    break;
            }
        } while (option != 4);
    }

    private int displayMenu() {
        System.out.print(
                """
                Choose an action:
                1. Add command.
                2. Remove a command from history.
                3. Show command history.
                4. Exit
                """);
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}
