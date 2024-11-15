package Oops.Interfaces.RemoteController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface RemoteControlCar {
    void drive();
    int getDistanceTravelled();
}

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distanceTravelled = 0;
    private int numberOfVictories = 0;

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.numberOfVictories);
    }
}

class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int distanceTravelled = 0;

    public void drive() {
        distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}

class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> sortedCars = new ArrayList<>(cars);
        Collections.sort(sortedCars);
        return sortedCars;
    }
}

public class Main {
    public static void main(String[] args) {
        
        ProductionRemoteControlCar productionCar = new ProductionRemoteControlCar();
        ExperimentalRemoteControlCar experimentalCar = new ExperimentalRemoteControlCar();

        productionCar.drive();
        System.out.println("Production car distance travelled: " + productionCar.getDistanceTravelled());

        experimentalCar.drive();
        System.out.println("Experimental car distance travelled: " + experimentalCar.getDistanceTravelled());
    }
}