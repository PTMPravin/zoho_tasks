package Java_Assaignment;

import java.util.Scanner;

public class Ancronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(ancronym(str));
        scanner.close();
    }

    public static String ancronym(String str) {
        String ans = "";
        ans+=str.charAt(0);
        for(int i=1;i<str.length();i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '-' || str.charAt(i) == '_') {
                if (i+1 < str.length()) {
                    ans+=str.charAt(i+1);
                }
            }
        }
        return ans.toUpperCase();
    }
}
