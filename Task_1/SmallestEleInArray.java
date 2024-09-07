package Tasks;

// QUESTION NUM : 13

public class SmallestEleInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5,6,4,11};
        int minEle = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i] <= minEle) {
                minEle = arr[i];
            }
        }
        System.out.println(minEle);
    }
}
