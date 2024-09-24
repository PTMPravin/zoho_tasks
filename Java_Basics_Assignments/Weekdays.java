package Assaignmet;

import java.util.Scanner;

enum Weekday {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Weekdays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date 1 To 7 : ");
        int dayNumber = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid input , Please enter a number between 1 and 7.");
        } else {
            Weekday weekday = Weekday.values()[dayNumber - 1];
            System.out.println("The day is: " + weekday);
        }

        scanner.close();
    }
}
