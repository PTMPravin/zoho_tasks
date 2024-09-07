package Tasks.CodingBat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class Toppin {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("potato", "ketchup");
        map.put("salad", "oil");

        if (map.containsKey("potato") && map.get("potato") != null) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad") && map.get("salad") != null) {
            map.put("spinach", map.get("salad"));
        }
            
        System.out.println(map);
    }
}
