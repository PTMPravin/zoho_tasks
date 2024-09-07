package Tasks.CodingBat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class MapAB4 {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbbb");
        map.put("c", "ccc");

        if (map.containsKey("a") && map.containsKey("b") && map.get("a") != null && map.get("b") != null) {
            if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            }else if(map.get("a").length() < map.get("b").length()){
                map.put("c", map.get("b"));
            }else{
                map.put("a", "");
                map.put("b", "");
            }
        }
        System.out.println(map);
    }
}
