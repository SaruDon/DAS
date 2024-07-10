public class Main{
    
    public static void subset(String str,String ans,int i){
        //base case
        if (i==str.length()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(i);
        subset(str, ans+ch, i+1);
        subset(str, ans, i+1);
    }
    
    public static void permutation(String str, String ans){
        // base case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr= str.substring(0, i) + str.substring(i+1);
            permutation(newStr,ans+ch);
        }
    }

    public static void nQueen(char board[][],int row){
        //base case
        if (row==board.length) {
            printBoard(board);
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board,row,col)) {
                board[row][col]='Q';
                nQueen(board, row+1);
                board[row][col]='_';
            }
        }    
    }



    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }

        for (int i = row, j= col; i >= 0 && j>=0; i--, j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        for (int i = row, j=col; i >=0 && j < board[0].length; j++,i--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // subset("abc","",0);
        // permutation("abc", "");
        char board[][]= new char[4][4];
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]='_';
            }
        }
        System.out.println();
        nQueen(board, 0);
    }
}