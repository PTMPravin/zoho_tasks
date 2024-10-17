package Java_Assaignment;

public class TicTacToe {
    public static void main(String[] args) {
                char[][] board1 = {
                        {'X', 'O', 'X'},
                        {'X', 'X', 'O'},
                        {'O', 'X', 'O'}
                };
        
                try {
                    System.out.println(gameState(board1));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        
            public static String gameState(char[][] board) {
                int xCount = 0, oCount = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i][j] == 'X') xCount++;
                        else if (board[i][j] == 'O') oCount++;
                    }
                }
                
                if (!(xCount == oCount || xCount == oCount + 1)) {
                    throw new IllegalArgumentException("Invalid number of Xs and Os.");
                }
        
                boolean xWins = checkWinner(board, 'X');
                boolean oWins = checkWinner(board, 'O');
        
                if (xWins && oWins) {
                    throw new IllegalArgumentException("Both players cannot win simultaneously.");
                }
        
                if (oWins && xCount != oCount) {
                    throw new IllegalArgumentException("O cannot win if X has more moves.");
                }
        
                if (xWins && xCount != oCount + 1) {
                    throw new IllegalArgumentException("X must have one more move than O if X wins.");
                }
        
                if (xWins) return "X wins";
                if (oWins) return "O wins";
        
                if (xCount + oCount == 9) {
                    return "Draw";
                }
        
                return "Ongoing";
            }
        
            public static boolean checkWinner(char[][] board, char player) {
                for (int i = 0; i < 3; i++) {
                    if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
                    if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
                }
        
                if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
                if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        
                return false;
            }
        }
