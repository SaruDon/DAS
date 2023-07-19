import java.util.Scanner;

public class income_tax {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  your income");
        double income = sc.nextFloat();
        if (income < 500000) {
            System.out.println("no tax");
        } else if (income > 500000 && income <= 1000000) {
            Double tax = .2 * income;
            income = income - tax;
            System.out.println("your income" + income);
        } else if (income > 1000000) {
            Double tax = .3 * income;
            income = income - tax;
            System.out.println("your income" + income);
        }

    }
}
