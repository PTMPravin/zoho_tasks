package Vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorToArrayConversion {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("red");
        vector.add("green");
        vector.add("blue");
        vector.add("yellow");

        String[] array = vector.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));

        Vector<String> newVector = new Vector<>(Arrays.asList(array));
        System.out.println("New Vector: " + newVector);
    }
}
