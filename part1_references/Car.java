package part1_references;

// Simple class used to demonstrate passing an object as a method argument (Part 1.2).
public class Car {
    // Properties of the object (can be changed inside a method that receives the reference)
    String model;
    int mileage;

    // Constructor sets initial state
    public Car(String model, int mileage) {
        this.model = model;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', mileage=" + mileage + "}";
    }
}