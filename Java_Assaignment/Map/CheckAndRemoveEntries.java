package Map;

import java.util.HashMap;

public class CheckAndRemoveEntries {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("John", 85);
        map.put("Jane", 92);
        map.put("Tom", 76);
        map.put("Lucy", 89);

        if (map.containsKey("Tom")) {
            System.out.println("Removing Tom's entry...");
            map.remove("Tom");
        }

        System.out.println("Updated map:");
        for (String name : map.keySet()) {
            System.out.println(name + " -> " + map.get(name));
        }
    }
}
