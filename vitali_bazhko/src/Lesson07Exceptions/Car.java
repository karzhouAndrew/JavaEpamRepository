package Lesson07Exceptions;

/**
 * Created by Admin on 24.04.15.
 */
public class Car {
    String brand;
    int speed;

    @Override
    public String toString() {
        return "Car{" +
                "brand = '" + brand + '\'' +
                ", speed = " + speed +
                '}';
    }

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}
