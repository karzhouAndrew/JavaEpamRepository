package lab5;

/**
 * Пылесосы
 */
public class VacuumCleaners extends HouseholdGoods{
    protected String TypeOfHarvesting;

    public VacuumCleaners (String name, String brand, int capacity, int weight, boolean powerControl, String TypeOfHarvesting) {
        this.name = name;
        this.brand = brand;
        this.capacity = capacity;
        this.weight = weight;
        this.powerControl = powerControl;
        this.TypeOfHarvesting = TypeOfHarvesting;
    }
}
