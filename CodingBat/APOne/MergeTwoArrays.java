package Tasks.CodingBat.APOne;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String arrA[] = {"a", "c", "z"};
        String arrB[] = {"c", "f", "z"};
        int n = 3;
        String ans[] = new String[n];
        System.out.println(Arrays.toString(mergeTwoArrays(arrA, arrB, ans, n)));
    }
    public static String[] mergeTwoArrays(String arrA[], String arrB[],String ans[], int n){
        int i = 0;
        int j = 0;
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        while (i < arrA.length || j < arrB.length) {
            if (i < arrA.length) {
                num1 = arrA[i].charAt(0);
            }
            if (j < arrB.length) {
                num2 = arrB[j].charAt(0);
            }
            if (i < arrA.length && j <= arrB.length && num1 <= num2) {
                ans[index++] = arrA[i];
                i++;
                if (num1 == num2) {
                    j++;
                }
            }else if (i < arrA.length && j < arrB.length && num1 > num2) {
                ans[index++] = arrB[j];
                j++;
            }else if (i >= arrA.length && j < arrB.length) {
                ans[index++] = arrB[j];
                j++;
            }else{
                ans[index++] = arrA[i];
                i++;
            }
            if (index == n) {
                i = arrA.length;
                j = arrB.length;
            }
        }
        return ans;
    }
}
