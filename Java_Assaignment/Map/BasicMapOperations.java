package Map;

import java.util.HashMap;
import java.util.Map;

public class BasicMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 30);
        map.put("Bob", 29);
        map.put("Charlie", 35);
        map.put("Diana", 28);
        map.put("Edward", 40);

        System.out.println("Charlie's age: " + map.get("Charlie"));
        System.out.println("All entries in the map:");

        for(Map.Entry<String, Integer> ele : map.entrySet()) {
            System.out.println("Name : "+ele.getKey()+" , Age : "+ele.getValue());
        }
    }
}
