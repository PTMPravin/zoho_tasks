package Tasks;

import java.util.Arrays;
// QUESTION NUM : 14
public class CopyArrayEle {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,9,10,13};
        int ans_arr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans_arr[i] = arr[i];
        }
        System.out.println(Arrays.toString(ans_arr));
    }
}
