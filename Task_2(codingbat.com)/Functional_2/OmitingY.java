package Tasks.CodingBat.Functional_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmitingY {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","yyb","ay"));
        System.out.println(omitingYAndAddingY(list));
    }
    public static List<String> omitingYAndAddingY(List<String> list){
        int i = 0;
        while (i < list.size()) {
            String str = list.get(i)+"y";
            if (str.contains("yy")) {
                list.remove(i);
            }else{
                list.set(i, str);
                i++;
            }
        }
        return list;
    }
}
