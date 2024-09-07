package Tasks.CodingBat.APOne;

public class ScoresHundred {
    public static void main(String[] args) {
        int arr[] = {100, 100, 100};
        System.out.println(score100(arr));
    }
    public static boolean score100(int arr[]){
        for(int i=0;i<arr.length - 1;i++){
            if(arr[i] == 100 && arr[i+1] == 100){
            return true;
            }
        }
        return false;
    }
}
