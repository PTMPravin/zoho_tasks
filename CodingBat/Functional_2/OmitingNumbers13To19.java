package Tasks.CodingBat.Functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmitingNumbers13To19 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,12,13));
        System.out.println(omiting13To19(list));
    }
    public static List<Integer> omiting13To19(List<Integer> list){
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) >= 13 && list.get(i) <= 19) {
                list.remove(i);
            }else{
                i++;
            }
        }
        return list;
    }
}
