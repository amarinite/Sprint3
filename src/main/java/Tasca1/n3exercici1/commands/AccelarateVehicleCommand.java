package Tasca1.n1exercici3.commands;

import Tasca1.n1exercici3.vehicle.Vehicle;

public class AccelarateVehicleCommand implements VehicleCommand {

    private Vehicle vehicle;

    public AccelarateVehicleCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute(){
        vehicle.accelerate();
    }
}
