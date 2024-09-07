package Tasks.CodingBat.APOne;

import java.util.ArrayList;
import java.util.List;

public class wordsWithoutList {
    public static void main(String[] args) {
        String arr[] = {"a", "bb", "b", "ccc"};
        int wordLen = 1;
        List<String> list = new ArrayList<>();
        System.out.println(wordWithoutList(arr, list, wordLen));
    }
    public static List<String> wordWithoutList(String arr[],List<String> list, int wordLen){
        for(int i=0;i<arr.length;i++){
            if (arr[i].length() != wordLen) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
