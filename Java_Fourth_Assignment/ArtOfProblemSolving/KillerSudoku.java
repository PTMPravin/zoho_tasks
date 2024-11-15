package ArtOfProblemSolving;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KillerSudoku {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter The Cage Sum : ");
       int cageSum = scanner.nextInt();

       System.out.println("Enter The Cage Length : ");
       int cageLength = scanner.nextInt();

       System.out.println("Numbers To Be Excluded : ");
       int length = scanner.nextInt();

       Set<Integer> numberToBeExcluded= new HashSet<>();
       System.out.println("Enter The Numbers To Be Excluded : ");
       for(int i=0;i<length;i++) {
        numberToBeExcluded.add(scanner.nextInt());
       }

       ArrayList<Integer> list = new ArrayList<>();
       findCombinationsHelper(list, numberToBeExcluded, cageSum, cageLength, length);
    }

    public static void findCombinationsHelper(ArrayList<Integer> list, Set<Integer> numberToBeExcluded, int cageSum, int cageLength, int n) {
        if(cageSum == 0 && cageLength == 0) {
            System.out.println(list);
        }

        if(cageSum <= 0 || cageLength <= 0) return;

        for(int i=n;i<=9;i++) {
            if (!numberToBeExcluded.contains(i)) {
                list.add(i);
                findCombinationsHelper(list, numberToBeExcluded, cageSum-i, cageLength-1, i+1);
                list.remove(list.size()-1);
            }
        }
    }
}