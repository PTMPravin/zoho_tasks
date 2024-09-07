package Tasks.CodingBat.Recursion2;

import java.util.ArrayList;
import java.util.List;

public class GroupSUm {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int target = 9;
        List<Integer> list = new ArrayList<>();
        System.out.println(sum(arr, list, target, 0));
    }
    public static boolean sum(int arr[], List<Integer> list, int target, int i){
        // if (i == arr.length) {
        //     return target == 0;
        // }
        if(target <= 0){
            return target == 0;
        }

        // list.add(arr[i]);
        // if (sum(arr, list, target-arr[i], i+1)) {
        //     return true;
        // }
        
        // // list.remove(list.size()-1);
        // if (sum(arr, list, target, i+1)) {
        //     return true;
        // }

        for(int j = i; j < arr.length; j++){
            //do 
            target = target - arr[j];
            //recurse
            if(sum(arr, list, target, j+1)){
                return true;
            }
            //undo
            target = target + arr[j];
        }

        return false;
    }
}
