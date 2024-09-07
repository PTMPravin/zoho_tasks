package Tasks.CodingBat.Recursion2;

public class Split53 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 2};
        System.out.println(split53(arr, 0, 0, 0));
    }
    public static boolean split53(int arr[], int i, int sum1, int sum2){
        if (i == arr.length) {
            return sum1 == sum2;
        }

        if (arr[i] % 5 == 0) {
            return split53(arr, i + 1, sum1 + arr[i], sum2);
        }

        if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
            return split53(arr, i + 1, sum1, sum2 + arr[i]);
        }

        if (split53(arr, i + 1, sum1 + arr[i], sum2)) {
            return  true;
        }

        if (split53(arr, i + 1, sum1, sum2 + arr[i])) {
            return true;
        }

        return false;
        
    }
}
