import java.util.*;
import java.util.Scanner;

public class area_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side");
        int a = sc.nextInt();
        System.out.print("Enter 2st side");
        int b = sc.nextInt();
        int area = a * b;
        System.out.print("Area:");
        System.out.print(area);

    }
}
