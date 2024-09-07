package Tasks;

import java.util.Scanner;

// QUESTION NUM : 1

public class Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = scanner.next().charAt(0);
        char last = 'z';
        int n = ch;
        if (n >= 65 && n <= 90) {
            last = 'Z';
        }
        for(char i=ch;i<=last;i++){
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
