
public class zero_one_triangle {

    public static void triangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        triangle(5);
    }
}
