<<<<<<< HEAD

public class hollow_rect {

    public static void rect(int colNo, int rowNo) {
        for (int i = 1; i <= rowNo; i++) {
            for (int j = 1; j <= colNo; j++) {
                if (i == 1 || j == 1 || i == rowNo || j == colNo) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String arg[]) {
        rect(4, 5);
    }
}
=======

public class hollow_rect {

    public static void rect(int colNo, int rowNo) {
        for (int i = 1; i <= rowNo; i++) {
            for (int j = 1; j <= colNo; j++) {
                if (i == 1 || j == 1 || i == rowNo || j == colNo) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String arg[]) {
        rect(4, 5);
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
