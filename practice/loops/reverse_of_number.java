import java.util.Scanner;

public class reverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int latsdigit = n % 10;
            rev = (rev * 10) + latsdigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
