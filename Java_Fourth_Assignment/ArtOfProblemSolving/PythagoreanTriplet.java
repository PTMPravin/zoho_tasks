package ArtOfProblemSolving;


import java.util.*;
public class PythagoreanTriplet {
    public static void main(String[] args) {
        int N = 1000; // example input
        List<int[]> triplets = findPythagoreanTriplets(N);

        // Print the triplets
        for (int[] triplet : triplets) {
            System.out.println("{" + triplet[0] + ", " + triplet[1] + ", " + triplet[2] + "}");
        }
    }

    public static List<int[]> findPythagoreanTriplets(int N) {
        List<int[]> triplets = new ArrayList<>();

        for (int a = 1; a <= N / 3; a++) {
            for (int b = a + 1; b <= N / 2; b++) {

                int c = N - a - b;

                if (a * a + b * b == c * c) {
                    triplets.add(new int[] {a, b, c});
                }
            }
        }
        
        return triplets;
    }
}