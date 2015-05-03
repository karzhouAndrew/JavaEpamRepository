package lab5;

/**
 * Компьютеры
 */
public class Computers extends ComputerEngineering {
    protected String operationalSystem;

    public Computers (String name, String brand, int capacity, int weight, String cpu, String operationalSystem) {
        this.name = name;
        this.brand = brand;
        this.capacity = capacity;
        this.weight = weight;
        this.cpu = cpu;
        this.operationalSystem = operationalSystem;
    }
}
