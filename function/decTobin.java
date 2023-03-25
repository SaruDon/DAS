import java.util.Scanner;

public class decTobin {

    public static void decTobin(int decNum) {
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + rem * (int) Math.pow(10, pow);
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Bianry number is:" + binNum);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        decTobin(a);

    }
}
