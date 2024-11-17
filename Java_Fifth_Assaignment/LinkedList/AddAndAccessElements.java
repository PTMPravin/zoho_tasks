package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class AddAndAccessElements {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        
        numbers.add(11);
        numbers.add(4);
        numbers.add(7);
        numbers.add(25);
        numbers.add(32);

        for(int n : numbers) {
            System.out.println(n);
        }
    }
}
