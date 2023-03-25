
public class inverted_and_rotated_pyradim {

    public static void pyramid(int noRow) {
        for (int i = 1; i <= noRow; i++) {
            // spaces
            for (int j = 1; j <= noRow - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String arg[]) {
        pyramid(4);
    }
}
