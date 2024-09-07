package Tasks.CodingBat.APOne;

import java.util.Arrays;

public class WordsWithout {
    public static void main(String[] args) {
        String arr[] = {"a", "a", "b", "b"};
        String tar = "a";
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if (!arr[i].equals(tar)) {
                count++;
            }
        }
        String ans[] = new String[count];
        System.out.println(Arrays.toString(wordNotRepeated(arr, ans, tar)));
    }
    public static String[] wordNotRepeated(String arr[] , String ans[] , String tar){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if (!arr[i].equals(tar)) {
                ans[index++] = arr[i];
            }
        }
        return ans;
    }
}
