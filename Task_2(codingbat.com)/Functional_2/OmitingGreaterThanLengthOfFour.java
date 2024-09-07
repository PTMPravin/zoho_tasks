package Tasks.CodingBat.Functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmitingGreaterThanLengthOfFour {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aa","bb","ccccccccc"));
        System.out.println(omittingLengthGreaterThan4(list));
    }
    public static List<String> omittingLengthGreaterThan4(List<String> list){
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).length() >= 4) {
                list.remove(i);
            }else{
                i++;
            }
        }
        return list;
    }
}
