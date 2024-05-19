public class Prac {


    public static  boolean isSafe(char board[][], int row, int col){
        //top
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        //left top
        for (int i = row-1 ,j =col-1; i >= 0 && j>=0; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }

        for (int i = row-1, j = col+1; i >=0 && j<board.length; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }


    public static void nQueen(char board[][], int row){
        if (row== board.length) {
            printChar(board);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i]='Q';
                nQueen(board, row+1);
                board[row][i]='X';
            }
        }
    }

    public static void printChar(char board[][]) {
        System.out.println("Chess boards are");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char board[][] = new char[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]='X';
            }
        }
        nQueen(board, 0);
    }
}
