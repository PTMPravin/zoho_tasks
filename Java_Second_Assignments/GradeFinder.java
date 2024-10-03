package Assignment;

import java.util.Scanner;

public class GradeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        System.out.println(grade(mark/10));
        scanner.close();
    }
    public static String grade(int mark) {
        switch (mark) {
            case 10:
                return "O";
            case 9:
                return "O";
            case 8:
                return "A+";
            case 7:
                return "A";
            case 6:
                return "B+";
            case 5:
                return "B";
            default:
                return "U";
        }
    }
}