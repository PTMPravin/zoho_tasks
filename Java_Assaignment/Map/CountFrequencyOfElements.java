package Map;

import java.util.HashMap;

public class CountFrequencyOfElements {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println(map);

        System.out.println("Frequency of each character:");
        for (char c : map.keySet()) {
            System.out.println(c + " -> " + map.get(c));
        }
    }
}
