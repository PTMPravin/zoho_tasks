package Tasks.CodingBat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "a"};
        Map<String , Boolean> map = new HashMap<>();
        System.out.println(wordCount(arr, map));
    }
    public static Map<String, Boolean> wordCount(String arr[] , Map<String, Boolean> map){
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], true);
            }else{
                map.put(arr[i], false);
            }
        }
        return map;
    }
}