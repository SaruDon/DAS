import java.util.Scanner;

public class sum_of_n_natural_numbers {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            number = i + number;
        }
        System.out.println(number);
    }
}
