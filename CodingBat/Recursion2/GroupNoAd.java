package Tasks.CodingBat.Recursion2;

public class GroupNoAd {
    public static void main(String[] args) {
        int arr[] = {2,4,7,8};
        int target = 12;
        System.out.println(sumNoAd(arr, target, 0));
    }
    public static boolean sumNoAd(int arr[], int target, int i){
        if (i >= arr.length) {
            return target == 0;
        }
        if (sumNoAd(arr, target, i+1)) {
            return true;
        }
        
        if (sumNoAd(arr, target-arr[i], i+2)) {
            return true;
        }
        return false;
    }
}
