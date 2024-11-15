package ArtOfProblemSolving;

import java.util.Arrays;
import java.util.List;

public class ResistorColor {
    public static void main(String[] args) {
        // Array storing the color code order
    List<String> colorBands = Arrays.asList(
        "black", "brown", "red", "orange", "yellow", 
        "green", "blue", "violet", "grey", "white"
    );

        String color = "red";
        int value = colorCode(colorBands, color);
        System.out.println("The color code for " + color + " is: " + value);

        System.out.println("All colors in order: " + colors(colorBands));
    }

    public static int colorCode(List<String> colorBands, String color) {
        return colorBands.indexOf(color.toLowerCase());
    }

    public static List<String> colors(List<String> colorBands) {
        return colorBands;
    }
}
