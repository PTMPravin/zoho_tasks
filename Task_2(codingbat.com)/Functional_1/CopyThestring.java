package Tasks.CodingBat.Functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyThestring {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("a","bb","ccc"));
        System.out.println(copyThestring(strings));
    }
    public static List<String> copyThestring(List<String> strings){
        for(int i=0;i<strings.size();i++){
            strings.set(i, strings.get(i) + strings.get(i) + strings.get(i));
        }
        return strings;
    }
}