package Tasks.CodingBat.Functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingStar {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        System.out.println(addingStars(arr));
    }
    public static List<String> addingStars(List<String> arr){
        for(int i=0;i<arr.size();i++){
            arr.set(i,arr.get(i) + '*');
        }
        return arr;
    }
}
