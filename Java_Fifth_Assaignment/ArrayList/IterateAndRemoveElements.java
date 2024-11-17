package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class IterateAndRemoveElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) > 30) {
                numbers.remove(i);
            }else{
                i++;
            }
        }

        System.out.println(numbers);
    }
}
