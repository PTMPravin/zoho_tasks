package Tasks.CodingBat.APOne;

public class ScoresAverage {
    public static void main(String[] args) {
        int arr[] = {4, 4, 4, 2, 2, 2};
        int half = arr.length/2;
        int firstHalf = average(arr, 0, half);
        int secondHlaf = average(arr, half, arr.length);
        if (firstHalf > secondHlaf) {
            System.out.println(firstHalf);
        }else{
            System.out.println(secondHlaf);
        }
    }
    public static int average(int arr[], int start, int end){
        int sum = 0;
        int members = 0;
        for(int i=start;i<end;i++){
            sum+=arr[i];
            members++;
        }
        return sum/members;
    }
}
