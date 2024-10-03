package Assignment;

import java.util.Scanner;

public class SecondOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to find its second occurrence: ");
        int target = scanner.nextInt();

        int index = findSecondOccurrence(arr, target);
        if (index != -1) {
            System.out.println(index);
        }else{
            System.out.println("The number " + target + " does not have a second occurrence in the array.");
        }
        scanner.close();
    }

    public static int findSecondOccurrence(int arr[], int target) {
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if (arr[i] == target) {
                count++;
            }
            if (count == 2) {
                return i;
            }
        }
        return -1;
    }
}