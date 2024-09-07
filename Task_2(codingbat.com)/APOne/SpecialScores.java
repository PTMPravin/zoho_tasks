package Tasks.CodingBat.APOne;

public class SpecialScores {
    public static void main(String[] args) {
        int arrA[] = {12, 10, 4};
        int arrB[] = {2, 20, 30};
        System.out.println(specialScores(arrA)+specialScores(arrB));
    }
    public static int specialScores(int arr[]){
        int score = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] % 10 == 0 && arr[i] >= score) {
                score = arr[i];
            }
        }
        return score;
    }
}
