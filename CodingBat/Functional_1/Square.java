package Tasks.CodingBat.Functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Square {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(square(arr));
    }
    public static List<Integer> square(List<Integer> arr){
        for(int i=0;i<arr.size();i++){
            arr.set(i , arr.get(i)*arr.get(i));
        }
        return arr;
    }
}
