package Java_Assaignment;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(pangram(str));
        scanner.close();
    }

    public static String pangram(String str) {
        int arr[] = new int[26]; 
        for(int i=0;i<str.length();i++) {
            int num = str.charAt(i);
            if (num >= 65 && num <=90) {
                arr[num-65] = 1;
            }else{
                arr[num-97] = 1;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                return "Is Not A Panagram!";
            }
        }
        return "It's A Pangram";
    }
}
