import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class largest_of_three_no {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }

        if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

}
