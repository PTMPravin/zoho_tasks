package Tasks.CodingBat.Map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public static void main(String[] args) {
        String arr[] = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(Arrays.toString(swapAll(arr)));
    }
    public static String[] swapAll(String arr[]){
        Map<String , Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(String.valueOf(arr[i].charAt(0))) && map.get(String.valueOf(arr[i].charAt(0))) != -1) {
                String st = arr[i];
                arr[i] = arr[map.get((String.valueOf(arr[i].charAt(0))))];
                arr[map.get((String.valueOf(arr[i].charAt(0))))] = st;
                map.put(String.valueOf(arr[i].charAt(0)), -1);
            }else{
                if (!map.containsKey(String.valueOf(arr[i].charAt(0)))) {
                    map.put(String.valueOf(arr[i].charAt(0)), i);
                }
            }
        }
        return arr;
    }
}
