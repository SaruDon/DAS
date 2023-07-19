import java.util.Scanner;

public class binary_to_decimal {

    public static void binTodeci(int binNum) {
        int pow = 0;
        int deNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            deNum = deNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of binary number  " + binNum + " is :" + deNum);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        binTodeci(a);

    }
}