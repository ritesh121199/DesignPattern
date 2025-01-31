package FactoryDesignPattern;

public class FourWheelerFcatory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new FourWheelerProduct();
    }
}
