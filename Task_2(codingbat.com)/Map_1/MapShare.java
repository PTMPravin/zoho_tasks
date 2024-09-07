package Tasks.CodingBat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class MapShare {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "bbb");
        map.put("e", "hi");

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        System.out.println(map);
    }
}
