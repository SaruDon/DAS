
import java.util.Scanner;

public class IncometaxCal {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income:");
        double income = sc.nextDouble();
        double tax;
        if (income < 500000) {
            System.out.println("0% tax");
            System.out.print("Income after CTC:");
            System.out.print(income);
            tax = 0 * income;
            System.out.println("tax:");
            System.out.print(tax);
        } else if (income > 500000 && income <= 1000000) {
            System.out.println("20% TAX");
            income = income - .2 * income;
            tax = .2 * income;
            System.out.print("Income atfer CTC:");
            System.out.print(income);
            System.out.println("tax:");
            System.out.print(tax);
        } else if (income > 1000000) {
            System.out.println("30% TAX");
            income = income - .3 * income;
            tax = .3 * income;
            System.out.print("Income atfer CTC:");
            System.out.print(income);
            System.out.println("tax:");
            System.out.print(tax);
        }

    }

}
