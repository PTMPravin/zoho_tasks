package Tasks.CodingBat.Recursion2;

public class GroupSum6 {
    public static void main(String[] args) {
        int arr[] = {6,4,7};
        int target = 11;
        System.out.println(sum6(arr, target, 0));
    }
    public static boolean sum6(int arr[], int target, int i){
        if (i == arr.length) {
            return target == 0;
        }
        if (arr[i] == 6) {
            return sum6(arr, target-arr[i], i+1);
        }

        if (sum6(arr, target-arr[i], i+1)) {
            return true;
        }

        if (sum6(arr, target, i+1)) {
            return true;
        }
        return false;
    }
}
