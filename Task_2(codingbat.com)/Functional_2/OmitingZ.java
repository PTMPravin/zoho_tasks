package Tasks.CodingBat.Functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmitingZ {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aa","bbb","az"));
        System.out.println(omitingZ(list));
    }
    public static List<String> omitingZ(List<String> list){
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).contains("z")) {
                list.remove(i);
            }else{
                i++;
            }
        }
        return list;
    }
}
