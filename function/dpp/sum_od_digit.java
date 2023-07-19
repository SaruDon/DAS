import java.util.Scanner;

public class sum_od_digit {

    public static int sumOfdigit(int number) {
        int sum = 0;
        int digits = number;
        while (digits != 0) {
            int lastDigit = digits % 10;
            sum = sum + lastDigit;
            digits = digits / 10;
        }
        System.out.println("Your an is:");
        return sum;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(sumOfdigit(a));
    }
}
