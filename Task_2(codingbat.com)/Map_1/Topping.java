package Tasks.CodingBat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class Topping {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("ice cream", "peanuts");
        
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        System.out.println(map);
    }
}
