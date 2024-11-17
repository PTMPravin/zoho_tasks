package Vector;

import java.util.Vector;

public class CheckForElementAndVectorSize {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>();
        vector.add(1.5);
        vector.add(2.5);
        vector.add(3.5);
        vector.add(4.7);

        boolean contains = vector.contains(10.5);

        System.out.println(contains);
        System.out.println(vector.size());
        vector.add(7.4);
        System.out.println(vector.size());
    }
}
