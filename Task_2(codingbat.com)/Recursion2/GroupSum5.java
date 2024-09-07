package Tasks.CodingBat.Recursion2;

public class GroupSum5 {
    public static void main(String[] args) {
        int arr[] = {15,25,1,7,5,6,4,8};
        int target = 41;
        System.out.println(sum5(arr, target, 0));
    }
    public static boolean sum5(int arr[], int target, int i){
        if (i == arr.length) {
            return target == 0;
        }
        if (arr[i] % 5 == 0) {
            if (i + 1 < arr.length && arr[i+1] == 1) {
                return sum5(arr, target-arr[i], i+2);
            }else{
                return sum5(arr, target-arr[i], i+1);
            }
        }

        if (sum5(arr, target-arr[i], i+1)) {
            return true;
        }

        if (sum5(arr, target, i+1)) {
            return true;
        }
        return false;
    }
}
