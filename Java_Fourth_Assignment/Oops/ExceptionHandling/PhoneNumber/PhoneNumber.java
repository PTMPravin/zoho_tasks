package Oops.ExceptionHandling.PhoneNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your phone number: ");
            long phoneNumber = scanner.nextLong();
            System.out.println("Your phone number is: " + phoneNumber);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}
