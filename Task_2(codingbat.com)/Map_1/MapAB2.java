package Tasks.CodingBat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("e", "eee");

        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        System.out.println(map);
    }
}
