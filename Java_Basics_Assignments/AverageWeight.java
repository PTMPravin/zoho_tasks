package Assaignmet;

import java.util.Scanner;

public class AverageWeight {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int sumOfWeights = 0;
        
        System.out.print("Enter Total Persons : ");
        int totalPerson = scanner.nextInt();

        int WeightsofPersons[] = new int[totalPerson];

        //Add Persons Weight To WeightsofPersons 
        for (int i = 0; i < WeightsofPersons.length; i++) {

            WeightsofPersons[i] = scanner.nextInt();

        }

        //Add Persons Weight
        for (int personsWeight = 0; personsWeight < WeightsofPersons.length; personsWeight++) {

            sumOfWeights+=WeightsofPersons[personsWeight];

        }
        
        double averageWeightsOfPersons = sumOfWeights/totalPerson;

        System.out.println(averageWeightsOfPersons);

        scanner.close();

    }
}
