package BehavourialDesignPattern.StrategyDesignPattern;

public class NormalVehicle extends Vehicle{

    NormalVehicle(){super(new OnRoadDriveStrategy());}
}
