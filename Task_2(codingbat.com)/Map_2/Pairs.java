package Tasks.CodingBat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) {
        String arr[] = {"code", "bug"};
        Map<String , String> map = new HashMap<>();
        System.out.println(word0(arr, map));
    }
    public static Map<String, String> word0(String arr[] , Map<String, String> map){
        for(int i=0;i<arr.length;i++){
            map.put(String.valueOf(arr[i].charAt(0)), String.valueOf(arr[i].charAt(arr[i].length()-1)));
        }
        return map;
    }
}
