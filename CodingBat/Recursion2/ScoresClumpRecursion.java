package Tasks.CodingBat.Recursion2;

public class ScoresClumpRecursion {
    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 7, 3, 1, 4};
        int target = 11;
        System.out.println(scoresCump(arr, target, 0));
    }
    public static boolean scoresCump(int arr[], int target, int i){

        if (i == arr.length) {
            return target == 0;
        }

        int n = arr[i];
        int count = 1;
        int sum = arr[i];
        for(int k=i+1;k<arr.length;k++){
            if (arr[k] == n) {
                sum+=arr[k];
                count++;
            }
        }
        if (scoresCump(arr, target-sum, i+count)) {
            return true;
        }
        if (scoresCump(arr, target, i+count)) {
            return true;
        }
        return false;
    }
}
