package Tasks.CodingBat.Recursion2;

public class SplitArray {
    public static void main(String[] args) {
        int arr[] = {5, 2, 3};
        System.out.println(splitArray(arr, 0, 0, 0));
    }
    public static boolean splitArray(int arr[], int i, int sum1, int sum2){
        if (i == arr.length) {
            return sum1 == sum2;
        }

        return splitArray(arr, i + 1, sum1 + arr[i], sum2) || splitArray(arr, i + 1, sum1, sum2 + arr[i]);
    }
}
