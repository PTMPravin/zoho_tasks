package Tasks.CodingBat.Functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class covertingToLowerCase {
    public static void main(String[] args) {
        
        List<String> strings = new ArrayList<>(Arrays.asList("Hello", "Hi"));
        System.out.println(convertingToLowerCase(strings));
    }
    public static List<String> convertingToLowerCase(List<String> strings){
        for(int i=0;i<strings.size();i++){
            strings.set(i, strings.get(i).toLowerCase());
        }
        return strings;
    }
}
