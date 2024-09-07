package Tasks.CodingBat.APOne;

import java.util.Arrays;

public class CopyEvens {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5,6,4,8};
        int n = 4;
        int ans[] = new int[n];
        System.out.println(Arrays.toString(copyEvenNumbers(arr,ans,n)));
    }
    public static int[] copyEvenNumbers(int arr[], int ans[], int n){
        int index = 0;
        for(int i=0;i<arr.length && index < n;i++){
            if (arr[i] % 2 == 0) {
                ans[index++] = arr[i];
            }
        }
        return ans;
    }
}
