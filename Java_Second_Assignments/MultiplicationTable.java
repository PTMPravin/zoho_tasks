package Assignment;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting Number Of Table : ");
        int start = scanner.nextInt();
        System.out.println("Multiplier Number : ");
        int multiple = scanner.nextInt();
        System.out.println("Ending Number Of Table : ");
        int end = scanner.nextInt();
        print(start, multiple, end);
        scanner.close();
    }

    public static void print(int start, int multiple, int end) {
        for(int i=start;i<=end;i++){
            System.out.printf("%2d * %d = %2d\n", i, multiple, i*multiple);
        }
    }
}
