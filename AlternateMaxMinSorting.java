package Tasks;

import java.util.Arrays;

// QUESTION NUM : 17

public class AlternateMaxMinSorting {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5, 6, 4};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (i%2 == 0) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }else{
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
