package Tasks.CodingBat.Functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmitingEndByNine {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,39));
        System.out.println(omitingEndWithNine(list));
    }
    public static List<Integer> omitingEndWithNine(List<Integer> list){
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 10 == 9) {
                list.remove(i);
            }else{
                i++;
            }
        }
        return list;
    }
}
