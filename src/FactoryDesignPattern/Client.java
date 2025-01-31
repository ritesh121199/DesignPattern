package FactoryDesignPattern;

public class Client {
    public Vehicle createVehicle(VehicleFactory vehicleFactory){
        return vehicleFactory.createVehicle();
    }
}
