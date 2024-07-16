package Tasca1.n3exercici1.invoker;

import Tasca1.n3exercici1.commands.VehicleCommand;

import java.util.ArrayList;
import java.util.List;

public class VehicleCommandInvoker {
    private final List<VehicleCommand> commands = new ArrayList<>();

    public void addCommand(VehicleCommand command) {
        commands.add(command);
    }

    public void executeCommands() {
        commands.forEach(VehicleCommand::execute);
        commands.clear();
    }
}
