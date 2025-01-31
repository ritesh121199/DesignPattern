package BuilderDesignPattern;

// this is product in this case
public class Computer {
    private int cpu;
    private int storage;
    private int ram;

    public void setCPU(int x){
        this.cpu=x;
    }

    public void setStorage(int y){
        this.storage=y;
    }

    public void setRAM(int z){
        this.ram=z;
    }

    public void getResult(){
        System.out.println("jhv");
    }
}
