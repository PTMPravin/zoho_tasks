package Tasks.CodingBat.Functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyingByTwo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(doubling(arr));
    }
    public static List<Integer> doubling(List<Integer> arr) {
        for(int i=0;i<arr.size();i++){
            arr.set(i , arr.get(i)*2);
        }
        return arr;
}
}
