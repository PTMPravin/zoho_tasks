import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Row : ");
        int row = scanner.nextInt();
        System.out.println("Enter The Column : ");
        int column = scanner.nextInt();
        System.out.println("Enter The Player Position");
        int playerRowPosition = scanner.nextInt();
        int playerColumnPosition = scanner.nextInt();
        System.out.println("Enter The Gold Position");
        int goldRowPosition = scanner.nextInt();
        int goldColumnPosition = scanner.nextInt();

        char board[][] = new char[row][column];
        board[playerRowPosition][playerColumnPosition] = 'P';
        board[goldRowPosition][goldColumnPosition] = 'G';
        int checked[][] = new int[row][column];

        List<Integer> list = new ArrayList<>();
        helper(list, board, checked, playerRowPosition, playerColumnPosition, 0);
        System.out.println(list.get(0));

    }

    public static boolean helper(List<Integer> list,char board[][], int checked[][], int row, int col, int count) {

        if (row < 0 || row > board.length-1) {
            return false;
        }

        if (col < 0 || col > board[row].length-1) {
            return false;
        }

        if (board[row][col] == 'G') {
            list.add(count);
            return true;
        }

        //Right Side
        if (checked[row][col] == 0) {
            checked[row][col] = 1;
            return helper(list, board, checked, row, col+1, count+1);
        }
        count-=1;
        checked[row][col] = 0;
        
        //Up Side
        if (checked[row][col] == 0) {
            checked[row][col] = 1;
            return helper(list, board, checked, row-1, col, count+1);
        }
        count-=1;
        checked[row][col] = 0;

        //Left Side
        if (checked[row][col] == 0) {
            checked[row][col] = 1;
            return helper(list, board, checked, row, col-1, count+1);
        }
        count-=1;
        checked[row][col] = 0;

        //Down Side
        if (checked[row][col] == 0) {
            checked[row][col] = 1;
            return helper(list, board, checked, row+1, col, count+1);
        }
        count-=1;
        checked[row][col] = 0;

        return false;
    }
}
