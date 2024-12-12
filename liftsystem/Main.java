package thirdround.liftsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bool = true;
        Lift lift1 = new Lift("L1", 10);
        Lift lift2 = new Lift("L2", 10);
        Lift lift3 = new Lift("L3", 10);
        Lift lift4 = new Lift("L4", 10);
        Lift lift5 = new Lift("L5", 10);

        lift1.setCurrentPosition(10);
        lift2.setCurrentPosition(2);
        lift3.setCurrentPosition(5);
        lift4.setCurrentPosition(9);

        List<Lift> lifts = new ArrayList<>();
        lifts.add(lift1);
        lifts.add(lift2);
        lifts.add(lift3);
        lifts.add(lift4);
        lifts.add(lift5);

        while (bool) {
            System.out.println("\nPlease Choose!....");
            System.out.println("Press 1 For Display Lifts");
            System.out.println("Press 2 For Display Lifts Current Floor");
            System.out.println("Press 3 For Lift");
            System.out.println("Press 4 For Exit");

            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    displayLifts();
                    break;
                case 2:
                    displayLiftCurrentFloor(lifts);
                    break;
                case 3:
                    lift(scanner, lifts);
                    break;
                case 4:
                    bool = false;
                    break;
                default:
                    System.out.println("Please Enter A Correct Number!....");
                    break;
            }
        }
    }

    public static void displayLifts() {
        System.out.println("L1 L2 L3 L4 L5");
    }

    public static void displayLiftCurrentFloor(List<Lift> lifts) {
        for(int i=0;i<lifts.size();i++) {
            System.out.print(lifts.get(i).getName()+ " " +lifts.get(i).getCurrentPosition() + "  ");
        }
    }

    public static void lift(Scanner scanner, List<Lift> lifts) {
        System.out.println("Current Floor Number : (Floors From 0 to 10)");
        int currentFloor = scanner.nextInt();

        System.out.println("Which Floor You Want To Go : (Floors From 0 to 10)");
        int destinationFloor = scanner.nextInt();

        String direction = currentFloor > destinationFloor ? "Upward" : "Downward"; 

        Lift nearestLift = null;
        int nearest = Integer.MAX_VALUE;
        for(int i=0;i<lifts.size();i++) {
            int num = 0;
            if (lifts.get(i).getName().equals("L1") || lifts.get(i).getName().equals("L2")) {
                
            }else if (lifts.get(i).getName().equals("L3") || lifts.get(i).getName().equals("L4")) {
                num = Math.abs(currentFloor - lifts.get(i).getCurrentPosition());
            }else{
                num = Math.abs(currentFloor - lifts.get(i).getCurrentPosition());
            }
            if (num == nearest) {
                if (direction.equals("Upward")) {
                    nearestLift = lifts.get(i).getCurrentPosition() < nearestLift.getCurrentPosition() ? lifts.get(i) : nearestLift;  
                }else {
                    nearestLift = lifts.get(i).getCurrentPosition() > nearestLift.getCurrentPosition() ? lifts.get(i) : nearestLift;
                }
            }else if (num < nearest) {
                nearest = num;
                nearestLift = lifts.get(i);
            }
        }

        System.out.println(nearestLift.getName() + " Is Assigned");
        nearestLift.setCurrentPosition(destinationFloor);
    }
}
