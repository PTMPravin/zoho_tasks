package Oops.Inheritance.VehicleHierarchy;

public class Car extends Vehicle{
    String model;

    Car(String model) {
        this.model = model;
    }

    void start() {
        System.out.println(model + " Car Started!");
    }

    void stop() {
        System.out.println(model + " Car Stoped!");
    }
}
