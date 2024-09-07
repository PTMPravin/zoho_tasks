package Tasks.CodingBat.Functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmitingLength3And4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aa","bbb","aaaaaaaa"));
        System.out.println(omitingLengthOfThreeAndFour(list));
    }
    public static List<String> omitingLengthOfThreeAndFour(List<String> list){
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).length() == 3 || list.get(i).length() == 4) {
                list.remove(i);
            }else{
                i++;
            }
        }
        return list;
    }
}
