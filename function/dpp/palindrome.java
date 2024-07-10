import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(int number) {
        int palindrom = number;
        int revserse = 0;
        while (palindrom != 0) {
            int remainder = revserse % 10;
            revserse = revserse * 10 + remainder;
            palindrom = palindrom / 10;
        }
        if (number == revserse) {
            return true;
        }
        return false;
    }

    public static void main(String arg[]) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (isPalindrome(a)) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("it in not palindrome");
        }
    }
}
