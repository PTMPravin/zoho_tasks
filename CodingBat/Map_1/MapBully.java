package Tasks.CodingBat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbbb");
        map.put("c", "ccc");

        if (map.containsKey("a") && map.get("a") != null) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        System.out.println(map);
    }
}
