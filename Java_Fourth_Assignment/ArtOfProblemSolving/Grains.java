package ArtOfProblemSolving;

import java.math.BigInteger;

public class Grains {
    public static void main(String[] args) {

        int totalSquares = 64;

        BigInteger total = BigInteger.ZERO;

        for (int i = 0; i < totalSquares; i++) {
            
            BigInteger grainsOnCurrentSquare = BigInteger.valueOf(2).pow(i);
            
            
            total = total.add(grainsOnCurrentSquare);
            
            
            System.out.println("Grains on square " + (i + 1) + ": " + grainsOnCurrentSquare);
        }

        System.out.println("Total grains on the chessboard: " + total);
    }
}
