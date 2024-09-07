package Tasks.CodingBat.Functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmitingLastDigit2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,6));
        System.out.println(omitingLastDigit2(list));
    }
    public static List<Integer> omitingLastDigit2(List<Integer> list){
        int i = 0;
        while (i < list.size()) {
            int num = list.get(i)*2;
            if (num % 10 == 2) {
                list.remove(i);
            }else{
                list.set(i, num);
                i++;
            }
        }
        return list;
    }
}
