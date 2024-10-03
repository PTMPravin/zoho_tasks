package Assignment;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(sumOfEvenNumbers(arr));
        scanner.close();
    }
    
    public static int sumOfEvenNumbers(int arr[]) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] % 2 != 0) {
                continue;
            }
            sum+=arr[i];
        }
        return sum;
    }
}
