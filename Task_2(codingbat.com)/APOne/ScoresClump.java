package Tasks.CodingBat.APOne;

public class ScoresClump {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5};
        System.out.println(checkItsAdjacent(arr));
    }
    public static boolean checkItsAdjacent(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            int diff = arr[i+2] - arr[i];
            if (diff <= 2) {
                return true;
            }
        }
        return false;
    }
}
