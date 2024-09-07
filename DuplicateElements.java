package Tasks;

// QUESTION NUM : 15

import java.util.HashMap;
import java.util.Map;
public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5,6,4,7,4,3,4,7};
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])) {
                int value = map.get(arr[i])+1;
                map.put(arr[i], value);
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> sets : map.entrySet()){
            if (sets.getValue() > 1) {
                System.out.println(sets.getKey());
            }
        }
    }
}
