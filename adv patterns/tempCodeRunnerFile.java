
public class hollow_rhombus_pattern{

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= n; a++) {
                if (i == 1 || i == n || a == 1 || a == n) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }

            }

            System.out.println();
        }
    }

    public static void main(String arg[]) {
        hollow_rhombus(4);
    }
}
