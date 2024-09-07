package Tasks.CodingBat.APOne;

public class ScoresIncresingOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        System.out.println(isIncresing(arr));
    }
    public static boolean isIncresing(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
