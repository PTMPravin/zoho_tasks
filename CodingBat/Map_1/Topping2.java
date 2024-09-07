package Tasks.CodingBat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class Topping2 {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("ice cream", "cherry");
        map.put("spinach", "dirt");
        
        if (map.containsKey("ice cream") && map.get("ice cream") != null) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach") && map.get("spinach") != null) {
            map.put("spinach", "nuts");
        }
        System.out.println(map);
    }
}
