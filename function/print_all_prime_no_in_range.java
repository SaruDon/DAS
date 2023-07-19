import java.util.Scanner;

public class print_all_prime_no_in_range {

    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInrange(int range) {
        for (int i = 2; i <= range; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        primesInrange(a);

    }
}
