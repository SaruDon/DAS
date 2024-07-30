
public class sudoku {

    //Q)37
    public static void printMatric(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + "");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        //col
        for (int j = 0; j <= 8; j++) {
            if (sudoku[j][col] == digit) {
                return false;
            }
        }
        //sub matrix
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        if (row == 9) {
            return true;
        }

        //kam
        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit) == true) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int sudoku[][] = {
            {0, 7, 0, 0, 0, 0, 0, 4, 3},
            {0, 4, 0, 0, 0, 9, 6, 1, 0},
            {8, 0, 0, 6, 3, 4, 9, 0, 0},
            {0, 9, 4, 0, 5, 2, 0, 0, 0},
            {3, 5, 8, 4, 6, 0, 0, 2, 0},
            {0, 0, 0, 8, 0, 0, 5, 3, 0},
            {0, 8, 0, 0, 7, 0, 0, 9, 1},
            {9, 0, 2, 1, 0, 0, 0, 0, 5},
            {0, 0, 7, 0, 4, 0, 8, 0, 2}
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("exist");
            printMatric(sudoku);
        } else {
            System.out.println("No sol");
        }
    }
}
