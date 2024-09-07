package Tasks.CodingBat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "a", "c", "a", "d", "a"};
        Map<String , Integer> map = new HashMap<>();
        System.out.println(wordCount(arr, map));
    }
    public static String wordCount(String arr[] , Map<String, Integer> map){
        String result = "";
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) % 2 == 0) {
                result+=arr[i];
            }
        }
        return result;
    }
}
