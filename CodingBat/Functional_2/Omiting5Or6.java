package Tasks.CodingBat.Functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Omiting5Or6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,5));
        System.out.println(omiting6and5(list));
    }
    public static List<Integer> omiting6and5(List<Integer> list){
        int i = 0;
        while (i < list.size()) {
            int num = list.get(i)*list.get(i)+10;
            if (num % 10 == 5 || num % 10 == 6) {
                list.remove(i);
            }else{
                list.set(i, num);
                i++;
            }
        }
        return list;
    }
}
