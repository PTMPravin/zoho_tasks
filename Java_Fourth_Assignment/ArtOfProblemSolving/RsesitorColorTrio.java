package ArtOfProblemSolving;

import java.util.Arrays;
import java.util.List;

public class RsesitorColorTrio {
    public static void main(String[] args) {
        
    List<String> colorBands = Arrays.asList(
        "black", "brown", "red", "orange", "yellow", 
        "green", "blue", "violet", "grey", "white"
    );
        
        System.out.println(decodeResistance(colorBands, "orange", "orange", "black"));
        System.out.println(decodeResistance(colorBands, "orange", "orange", "red"));
        System.out.println(decodeResistance(colorBands, "orange", "orange", "orange"));
    }

    public static String decodeResistance(List<String> colorBands, String color1, String color2, String multiplierColor) {

        int firstDigit = colorBands.indexOf(color1.toLowerCase());
        int secondDigit = colorBands.indexOf(color2.toLowerCase());
        int multiplier = colorBands.indexOf(multiplierColor.toLowerCase());

        if (firstDigit == -1 || secondDigit == -1 || multiplier == -1) {
            throw new IllegalArgumentException("Invalid color provided.");
        }

        int mainValue = firstDigit * 10 + secondDigit;

        double resistance = mainValue * Math.pow(10, multiplier);

        if (resistance >= 1000) {
            resistance /= 1000;
            return "%.1f kiloohms"+ resistance;
        } else {
            return "%.0f ohms"+ resistance;
        }
    }

}
