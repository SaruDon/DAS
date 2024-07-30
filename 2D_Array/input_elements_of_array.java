
import java.util.Scanner;

public class input_elements_of_array {

    //2 search in matrix
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("found at position" + matrix[i][j]);
                    System.out.println();
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows");

        int n = sc.nextInt();
        System.out.println("enter columns");

        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }

        System.out.println("enter the key u want to search");
        int key = sc.nextInt();
        search(matrix, key);

    }
}
