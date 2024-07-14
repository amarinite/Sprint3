package Tasca1.n1exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Undo {
    private static Undo instance;
    private final ArrayList<String> COMMANDS;
    public Scanner input = new Scanner(System.in);

    private Undo() {
        COMMANDS = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand() {
        System.out.println("Add command: ");
        String comm = input.nextLine();
        COMMANDS.add(comm);
    }

    public void listCommands() {
        int i = 1;
        String commList = "";
        if (COMMANDS.isEmpty()) {
            commList = "No commands to show";
        } else {
            for (String comm : COMMANDS) {
                commList += i + " - " + comm + "\n";
                i++;
            }
        }
        System.out.println(commList);
    }

    public void removeCommand() {
        int option = 0;
        if (COMMANDS.isEmpty()) {
            System.out.println("No commands to delete. Please add a command.");
        } else {
            System.out.println("Please select a command to delete:\n");
            listCommands();
            option = input.nextInt();
            COMMANDS.remove(option - 1);
        }
    }
}