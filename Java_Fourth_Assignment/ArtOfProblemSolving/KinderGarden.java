package ArtOfProblemSolving;

import java.util.*;

public class KinderGarden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int index = 0;

        Map<Character, String> plantNames = Map.of(
            'G', "Grass",
            'C', "Clover",
            'R', "Radish",
            'V', "Violet"
        );

        List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Fred", 
        "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry");

        String row1 = "VRCGVVRVCGGCCGVRGCVCGCGV";
        String row2 = "VRCCCGCRRGVCGCRVVCVGCGCV";

        index = students.indexOf(name);
        int n = index*2;

        System.out.println("Name : "+name);
        System.out.println(plantNames.get(row1.charAt(n-2)));
        System.out.println(plantNames.get(row1.charAt(n-1)));
        System.out.println(plantNames.get(row2.charAt(n-2)));
        System.out.println(plantNames.get(row2.charAt(n-1)));

    }
}
