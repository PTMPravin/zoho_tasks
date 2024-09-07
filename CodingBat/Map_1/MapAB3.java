package Tasks.CodingBat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class MapAB3 {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");

        System.out.println(change(map));
    }
    public static Map<String, String> change(Map<String, String> map){
        if (map.containsKey("a") && map.containsKey("b")) {
            return map;
        }else{
            if (map.containsKey("a")) {
                map.put("b", map.get("a"));
            }
            if (map.containsKey("b")) {
                map.put("a", map.get("b"));
            }
        }
        return map;
    }
}
