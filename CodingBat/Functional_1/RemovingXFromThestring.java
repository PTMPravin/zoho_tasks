package Tasks.CodingBat.Functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingXFromThestring {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("ax", "xbxbx", "cccx"));
        System.out.println(removeXFromThestring(strings));
    }
    public static List<String> removeXFromThestring(List<String> strings){
        for(int i=0;i<strings.size();i++){
            strings.set(i, removeX(strings.get(i)));
        }
        return strings;
    }
    public static String removeX(String str){
        String ans_str = "";
        for(int i=0;i<str.length();i++){
            if (str.charAt(i) != 'x') {
                ans_str+=str.charAt(i);
            }
        }
        return ans_str;
    }
}
