package Tasks.CodingBat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class MapAB1 {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        map.put("e", "hi");

        if (map.containsKey("a") && map.containsKey("b")) {
            String str = map.get("a")+map.get("b");
            map.put("ab", str);
        }
        System.out.println(map);
    }
}
