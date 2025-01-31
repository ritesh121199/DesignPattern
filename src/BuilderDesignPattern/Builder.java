package BuilderDesignPattern;

public interface Builder {
    void buildCPU(int x);
    void buildRAM(int y);
    void buildStorage(int z);
    Computer getResult();
}
