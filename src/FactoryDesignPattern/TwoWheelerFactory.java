package FactoryDesignPattern;

public class TwoWheelerFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new TwoWheelerProduct();
    }
}
