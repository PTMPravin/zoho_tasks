package Vector;

import java.util.Arrays;
import java.util.Vector;

public class InsertAndRemoveElements {
    public static void main(String[] args) {
        Vector<Character> vector = new Vector<>(Arrays.asList('A','B','C'));

        vector.add(2, 'Q');
        System.out.println(vector);
        vector.remove(0);
        System.out.println(vector);
    }
}
