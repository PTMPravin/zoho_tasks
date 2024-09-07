package Tasks.CodingBat.APOne;

import java.util.Arrays;

public class WordsFront {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "c"};
        int n = 2;
        String ans[] = new String[n];
        System.out.println(Arrays.toString(wordsFront(arr, ans, n)));
    }
    public static String[] wordsFront(String arr[],String ans[], int n){
        for(int i=0;i<n;i++){
            ans[i] = arr[i];
        }
        return ans;
    }
}
