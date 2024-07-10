<<<<<<< HEAD

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
=======

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
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
