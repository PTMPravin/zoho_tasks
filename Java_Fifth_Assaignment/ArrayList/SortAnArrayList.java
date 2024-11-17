package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SortAnArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i=12;i>=1;i--) {
            numbers.add(i);
        }

        System.out.println(numbers);
        sort(numbers);
        System.out.println(numbers);
    }

    public static void sort(List<Integer> numbers) {
        for(int i=0;i<numbers.size();i++) {
            for(int j=i+1;j<numbers.size();j++) {

                int num1 = numbers.get(i);
                int num2 = numbers.get(j);

                if (num1 > num2) {
                    numbers.set(i, num2);
                    numbers.set(j, num1);
                }
            }
        }
    }
}
