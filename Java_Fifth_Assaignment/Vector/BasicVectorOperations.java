package Vector;

import java.util.Arrays;
import java.util.Vector;

public class BasicVectorOperations {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(10,20,30,40,50));
        System.out.println("Third Element : "+vector.get(2));
        System.out.println("All Element : "+vector);

    }
}
