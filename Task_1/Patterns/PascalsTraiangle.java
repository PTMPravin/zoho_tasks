package Tasks.Patterns;
import java.util.Scanner;

// QUESTION NUM : 20

public class PascalsTraiangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Row : ");
        int row = scanner.nextInt();
        int arr[][] = new int[row][row];

        for(int i=0;i<row;i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
            for(int j=1;j<i;j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int stp=0;stp<row-1-i;stp++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}