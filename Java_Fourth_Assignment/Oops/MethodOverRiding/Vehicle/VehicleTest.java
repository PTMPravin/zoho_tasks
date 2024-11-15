package Oops.MethodOverRiding.Vehicle;

class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

class Car extends Vehicle {
    
    public void start() {
        System.out.println("Car is starting with ignition.");
    }

    public void stop() {
        System.out.println("Car is stopping using brakes.");
    }
}

class Bike extends Vehicle {
    
    public void start() {
        System.out.println("Bike is starting with kickstart.");
    }

    
    public void stop() {
        System.out.println("Bike is stopping using hand brakes.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();

        vehicle1.start();
        vehicle1.stop();

        vehicle2.start();
        vehicle2.stop();
    }
}

