package ArtOfProblemSolving;

import java.util.Arrays;
import java.util.List;

public class ResistorColorDecoder {
    public static void main(String[] args) {

        List<String> colorBands = Arrays.asList(
            "black", "brown", "red", "orange", "yellow", 
            "green", "blue", "violet", "grey", "white"
        );

        String[] colors1 = {"brown", "green"};
        String[] colors2 = {"grey", "green"};
            
        System.out.println("Resistance for brown-green: " + decodeResistance(colorBands, colors1));
        System.out.println("Resistance for brown-green-violet: " + decodeResistance(colorBands, colors2));

    }

    public static int decodeResistance(List<String> colorBands, String[] colors) {
        if (colors.length < 2) {
            throw new IllegalArgumentException("At least two colors are required.");
        }
        
        int firstDigit = colorBands.indexOf(colors[0].toLowerCase());
        int secondDigit = colorBands.indexOf(colors[1].toLowerCase());

        if (firstDigit == -1 || secondDigit == -1) {
            throw new IllegalArgumentException("Invalid color provided.");
        }
        
        return firstDigit * 10 + secondDigit;
    }
}
