package BehavourialDesignPattern.StrategyDesignPattern;

public class OnRoadDriveStrategy implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("Onroad drive strategy");
    }
}
