package Tasks.CodingBat.APOne;

public class MatchUp {
    public static void main(String[] args) {
        String arr_1[] = {"aa", "bb", "cc"};
        String arr_2[] = {"aaa", "xx", "bb"};
        System.out.println(matchUp(arr_1, arr_2));
    }
    public static int matchUp(String arr_1[], String arr_2[]){
        int count = 0;
        for(int i=0;i<arr_2.length;i++){
            if (!arr_1[i].isEmpty() && !arr_2[i].isEmpty() && arr_1[i].charAt(0) == arr_2[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }
}
