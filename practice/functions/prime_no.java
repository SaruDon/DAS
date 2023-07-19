import java.util.Scanner;
import java.util.*;

public class prime_no {

    public static int prime(int n) {

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Non prime");
                break;
            } else {
                System.out.println("Number is prime");
                break;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(prime(a));
    }
}
