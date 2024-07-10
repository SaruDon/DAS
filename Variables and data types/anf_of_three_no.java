import java.util.*;

public class anf_of_three_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2st number");
        int b = sc.nextInt();
        System.out.println("Enter 3st number");
        int c = sc.nextInt();
        float sum = (a + b + c) / 3;
        System.out.print("Average:");
        System.out.print(sum);
    }
}
