package Tasks.CodingBat.Functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmitingLessThanZero {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,-1));
        System.out.println(omitingLessThanZeros(list));
    }
    public static List<Integer> omitingLessThanZeros(List<Integer> list){
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) < 0) {
                list.remove(i);
            }else{
                i++;
            }
        }
        return list;
    }
}
