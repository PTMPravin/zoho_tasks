package Tasks;

// QUESTION NUM : 18

import java.util.Arrays;

public class OddEvenPositionalSorting {
    public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9, 2, 7, 4, 5, 6, 3, 8, 1
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if (i%2 == 0 && j%2 == 0) {
                        if (arr[i] < arr[j]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }else if(i%2 != 0 && j%2 != 0){
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
