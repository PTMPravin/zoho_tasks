package Tasks.CodingBat.APOne;

public class WordsCount {
    public static void main(String[] args) {
        String arr[] = {"a", "bb", "b"};
        int wordLen = 3;
        System.out.println(wordCount(arr, wordLen));
    }
    public static int wordCount(String arr[], int wordLen){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i].length() == wordLen) {
                count++;
            }
        }
        return count;
    }
}
