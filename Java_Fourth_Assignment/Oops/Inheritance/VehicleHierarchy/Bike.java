package Oops.Inheritance.VehicleHierarchy;

public class Bike extends Vehicle {
    String model;

    Bike(String model) {
        this.model = model;
    }

    void start() {
        System.out.println(model + " Bike Started!");
    }

    void stop() {
        System.out.println(model + " Bike Stopped!");
    }
}
