
public class nqueens {

    //Q)33
    public static void printChar(char board[][]) {
        System.out.println("Chess boards are");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void queens(char board[][], int row) {

        if (board.length == row) {
            // printChar(board);
            // count ++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j) == true) {
                board[row][j] = 'Q';
                queens(board, row + 1);
                board[row][j] = '.';
            }
        }

        // return count;
    }

    static int count = 0;

    public static boolean isSafe(char board[][], int row, int col) {
        //up cheack
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        //diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                board[i][j] = '.';
            }
        }
        // printChar(board);
        // System.out.println(queens(board,0));
    }
}
