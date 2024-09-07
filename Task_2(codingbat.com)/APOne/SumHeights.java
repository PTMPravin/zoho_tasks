package Tasks.CodingBat.APOne;

public class SumHeights {
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 7, 2};
        int stIndex = 0;
        int endIndex = 4;
        System.out.println(sumOfHeights(arr, stIndex, endIndex));
    }
    public static int sumOfHeights(int heights[], int start, int end){
        int sum = 0;
        for(int i=start;i<end;i++){
            if (heights[i] >= heights[i+1]) {
                sum+=heights[i] - heights[i+1];
            }else{
                sum+=heights[i+1] - heights[i];
            }
        }
        return sum;
    }
}
