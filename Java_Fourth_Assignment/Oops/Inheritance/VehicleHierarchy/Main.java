package Oops.Inheritance.VehicleHierarchy;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Pulsar");
        bike.start();
        bike.stop();
        Car car = new Car("Tata");
        car.start();
        car.stop();
    }
}
