package BehavourialDesignPattern.StrategyDesignPattern;

public class OffRoadStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("ofroad drive strategy");
    }
}
