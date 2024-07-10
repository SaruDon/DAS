import java.util.Scanner;

public class palin {

    public static boolean palindrom(int n) {
        int palindrome = n;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (n == reverse) {
            return true;

        }
        return false;

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();

        if (palindrom(a)) {
            System.out.println("number is palindrome");
        }

        else {
            System.out.println("is not palindrome:");
        }
    }
}
