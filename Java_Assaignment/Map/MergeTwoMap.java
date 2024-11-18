package Map;

import java.util.HashMap;

public class MergeTwoMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("a", 1);
        map1.put("b", 2);

        map2.put("b", 3);
        map2.put("c", 4);

        map2.forEach(map1::put);

        System.out.println("Merged map:");
        for (String key : map1.keySet()) {
            System.out.println(key + " -> " + map1.get(key));
        }
    }
}
