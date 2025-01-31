import BuilderDesignPattern.Builder;
import BuilderDesignPattern.Computer;
import BuilderDesignPattern.ConputerDirector;
import BuilderDesignPattern.GamingComputerBuilder;
import FactoryDesignPattern.Client;
import FactoryDesignPattern.TwoWheelerFactory;
import FactoryDesignPattern.Vehicle;
import FactoryDesignPattern.VehicleFactory;
import Prototype.Prototype;
import Prototype.Student;
import Singleton.SingletonSample;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        //Singleton object crearion
        SingletonSample a=SingletonSample.getSingletonInstance();

        //Prototype sample-- it is used to copy object which has private field
        // and that can be accessed only inside that method
        Student studentFirst =new Student("Ritesh",1);
        Prototype studentFirstcopy=studentFirst.clone();

        //FcatoryDesignPattern
        VehicleFactory twoWheelerFactory=new TwoWheelerFactory();
        Client newClient=new Client();
        Vehicle newVehicle= newClient.createVehicle(twoWheelerFactory);
        newVehicle.printVehicle();

        //builder design pattern
        Builder gamingComputer= new GamingComputerBuilder();
        ConputerDirector gamingComputerDirector= new ConputerDirector();
        gamingComputerDirector.create(gamingComputer);
        Computer newComputer= gamingComputer.getResult();



    }
}