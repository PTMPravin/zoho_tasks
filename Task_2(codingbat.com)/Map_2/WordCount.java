package Tasks.CodingBat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "a", "b"};
        Map<String , Integer> map = new HashMap<>();
        System.out.println(wordCount(arr, map));
    }
    public static Map<String, Integer> wordCount(String arr[] , Map<String, Integer> map){
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        return map;
    }
}
