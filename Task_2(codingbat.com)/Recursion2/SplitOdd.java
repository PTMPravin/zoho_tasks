package Tasks.CodingBat.Recursion2;

public class SplitOdd {
    public static void main(String[] args) {
        int arr[] = {5, 5, 6};
        System.out.println(splitArray(arr, 0, 0, 0));
    }
    public static boolean splitArray(int arr[], int i, int sum1, int sum2){
        if (i == arr.length) {
            return sum1 % 10 == 0 && sum2 % 2 != 0;
        }

        if (splitArray(arr, i + 1, sum1 + arr[i], sum2)) {
            return true;
        }
        if (splitArray(arr, i + 1, sum1, sum2 + arr[i])) {
            return true;
        }

        // return splitArray(arr, i + 1, sum1 + arr[i], sum2) || splitArray(arr, i + 1, sum1, sum2 + arr[i]);
        return false;
    }
}