package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Original ArrayList: " + fruits);

        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Converted Array: " + Arrays.toString(fruitArray));
        
        ArrayList<String> newFruitList = new ArrayList<>(Arrays.asList(fruitArray));
        System.out.println("Converted Back to ArrayList: " + newFruitList);
    }
}
