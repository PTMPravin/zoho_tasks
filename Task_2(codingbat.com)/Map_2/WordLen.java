package Tasks.CodingBat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public static void main(String[] args) {
        String arr[] = {"a", "bb", "a", "bb"};
        Map<String , Integer> map = new HashMap<>();
        System.out.println(word0(arr, map));
    }
    public static Map<String, Integer> word0(String arr[] , Map<String, Integer> map){
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], arr[i].length());
        }
        return map;
    }
}
