package Tasks.CodingBat.Functional_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingYToThestring {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        System.out.println(addingY(strings));
    }
    public static List<String> addingY(List<String> strings) {
        for(int i=0;i<strings.size();i++){
            strings.set(i,'y' + strings.get(i) + 'y');
        }
        return strings;
    }
}
