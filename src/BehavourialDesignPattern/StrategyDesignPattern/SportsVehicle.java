package BehavourialDesignPattern.StrategyDesignPattern;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){super(new OffRoadStrategy());

    }
}
