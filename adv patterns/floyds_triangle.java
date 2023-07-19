<<<<<<< HEAD

public class floyds_triangle {

    public static void floyds(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        floyds(5);
    }
}
=======

public class floyds_triangle {

    public static void floyds(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        floyds(5);
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
