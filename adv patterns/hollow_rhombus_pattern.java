<<<<<<< HEAD

public class hollow_rhombus_pattern {

    public static void hollowrhombus(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= n; a++) {
                if (i == 1 || i == n || a == 1 || a == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }

    public static void main(String arg[]) {
        hollowrhombus(4);
    }
}
=======

public class hollow_rhombus_pattern {

    public static void hollowrhombus(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= n; a++) {
                if (i == 1 || i == n || a == 1 || a == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }

    public static void main(String arg[]) {
        hollowrhombus(4);
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
