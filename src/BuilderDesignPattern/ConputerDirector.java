package BuilderDesignPattern;

public class ConputerDirector {

    public void create(Builder gamingBuilder){
        gamingBuilder.buildStorage(5);
        gamingBuilder.buildCPU(5);
        gamingBuilder.buildRAM(5);
    }
}
