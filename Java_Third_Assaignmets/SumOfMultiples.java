package Java_Assaignment;

import java.util.HashSet;
import java.util.Set;

public class SumOfMultiples {
    public static void main(String[] args) {
        int num = 8;
        int arr[] = {4,7};
        
        System.out.println(sumOfMultiples(num, arr));
    }

    public static int sumOfMultiples(int num, int arr[]) {
        Set<Integer> uniqueMultiples = new HashSet<>();
        int total = 0;
        for (int baseValue : arr) {
            for (int multiple = baseValue; multiple < num; multiple += baseValue) {
                uniqueMultiples.add(multiple);
            }
        }

        for (int value : uniqueMultiples) {
            total += value;
        }

        return total;
    }
}
