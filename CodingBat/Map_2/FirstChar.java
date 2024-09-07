package Tasks.CodingBat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public static void main(String[] args) {
        String arr[] = {"salt", "tea", "soda", "toast"};
        Map<String , String> map = new HashMap<>();
        System.out.println(wordCount(arr, map));
    }
    public static Map<String, String> wordCount(String arr[] , Map<String, String> map){
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(String.valueOf(arr[i].charAt(0)))) {
                map.put(String.valueOf(arr[i].charAt(0)), map.get(String.valueOf(arr[i].charAt(0)))+arr[i]);
            }else{
                map.put(String.valueOf(arr[i].charAt(0)), arr[i]);
            }
        }
        return map;
    }
}
