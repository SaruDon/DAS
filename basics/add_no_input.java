import java.util.Scanner;

public class add_no_input {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no:");
        int a =sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum =a+b;
        System.out.print("Sum is:");
        System.out.println(sum);

    }
    
}
