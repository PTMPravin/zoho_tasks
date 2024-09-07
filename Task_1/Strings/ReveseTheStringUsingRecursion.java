package Tasks.Strings;

// QUESTION NUM : 10

public class ReveseTheStringUsingRecursion {
    public static void main(String[] args) {
        String str = "one two three";
        System.out.println(reverse(str, 0));
    }

    public static String reverse(String str , int index){
        if (!str.contains(" ")) {
            return str;
        }
        
        int sptaces = str.indexOf(" ");
        String word = str.substring(0, sptaces);
        String remainingWord = str.substring(sptaces+1);

        return reverse(remainingWord, index+1) + " " + word;
    }
}
