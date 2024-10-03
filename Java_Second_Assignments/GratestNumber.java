package Assignment;

import java.util.Scanner;

public class GratestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter The Third Number : ");
        int num3 = scanner.nextInt();

        System.out.println("Greatest Number : "+findGreatestNumber(num1, num2, num3));
        
        scanner.close();
    }

    public static int findGreatestNumber(int num1, int num2, int num3) {
        return num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
    }
}
