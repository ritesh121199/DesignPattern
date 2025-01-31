package BuilderDesignPattern;

public class GamingComputerBuilder implements Builder{

    private Computer computer;
    @Override
    public void buildCPU(int x) {
        computer.setCPU(x);
    }

    @Override
    public void buildStorage(int z) {
        computer.setStorage(z);
    }

    @Override
    public void buildRAM(int y) {
    computer.setRAM(y);
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
