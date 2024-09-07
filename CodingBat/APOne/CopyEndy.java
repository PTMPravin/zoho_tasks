package Tasks.CodingBat.APOne;

import java.util.Arrays;

public class CopyEndy {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 7, 6, 5, 4, 99};
        int n = 5;
        int ans[] = new int[n];
        System.out.println(Arrays.toString(copyTheNumbersFromTheRange(arr,ans,n)));
    }
    public static int[] copyTheNumbersFromTheRange(int arr[], int ans[], int n){
        int index = 0;
        for(int i=0;i<arr.length && index < n;i++){
            if (arr[i] >= 0 && arr[i] <= 10 || arr[i] >= 90 && arr[i] <= 100) {
                ans[index++] = arr[i];
            }
        }
        return ans;
    }
}
