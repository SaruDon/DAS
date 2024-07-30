
public class diagonalSum {

    //1 diagonal sum
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        /* for(int i=0;i<=matrix.length-1;i++){                //t(n)=n*n
        for(int j=0;j<=matrix[0].length-1;j++){
            if( i==j){
                sum += matrix[i][j];
            }
            else if( i+j == matrix.length-1){
                sum += matrix[i][j];
            }
        }
    }
         */
        for (int i = 0; i <= matrix.length - 1; i++) {

            sum += matrix[i][i];

            sum += matrix[i][matrix.length - 1 - i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        System.out.println(diagonalSum(matrix));
    }
}
