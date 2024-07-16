package Tasca1.n3exercici1;

import Tasca1.n3exercici1.commands.AccelarateVehicleCommand;
import Tasca1.n3exercici1.commands.BrakeVehicleCommand;
import Tasca1.n3exercici1.commands.StartVehicleCommand;
import Tasca1.n3exercici1.invoker.VehicleCommandInvoker;
import Tasca1.n3exercici1.vehicle.*;

public class Parking {
    public void initializeParking() {
        VehicleCommandInvoker vehicleCommandInvoker = new VehicleCommandInvoker();
        Vehicle car = new Car();
        vehicleCommandInvoker.addCommand(new StartVehicleCommand(car));
        vehicleCommandInvoker.addCommand(new AccelarateVehicleCommand(car));
        vehicleCommandInvoker.addCommand(new BrakeVehicleCommand(car));
        vehicleCommandInvoker.executeCommands();

        Bike bike = new Bike();
        vehicleCommandInvoker.addCommand(new StartVehicleCommand(bike));
        vehicleCommandInvoker.addCommand(new AccelarateVehicleCommand(bike));
        vehicleCommandInvoker.addCommand(new BrakeVehicleCommand(bike));
        vehicleCommandInvoker.executeCommands();

        Vehicle plane = new Plane();
        vehicleCommandInvoker.addCommand(new StartVehicleCommand(plane));
        vehicleCommandInvoker.addCommand(new AccelarateVehicleCommand(plane));
        vehicleCommandInvoker.addCommand(new BrakeVehicleCommand(plane));
        vehicleCommandInvoker.executeCommands();

        Boat boat = new Boat();
        vehicleCommandInvoker.addCommand(new StartVehicleCommand(boat));
        vehicleCommandInvoker.addCommand(new AccelarateVehicleCommand(boat));
        vehicleCommandInvoker.addCommand(new BrakeVehicleCommand(boat));
        vehicleCommandInvoker.executeCommands();
    }
}
