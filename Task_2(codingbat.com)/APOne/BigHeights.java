package Tasks.CodingBat.APOne;

public class BigHeights {
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 7, 2};
        int stIndex = 2;
        int endIndex = 4;
        System.out.println(bigHeights(arr, stIndex, endIndex));
    }
    public static int bigHeights(int[] heights, int start, int end) {
        int count = 0;
              for(int i=start;i<end;i++){
                if (Math.abs(heights[i] - heights[i+1]) >= 5) {
                    count++;
                }
              }
              return count;
      }
      
}
