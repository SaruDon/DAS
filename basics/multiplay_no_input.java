import java.util.Scanner;
public class multiplay_no_input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no:");
        int a =sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int multiplication =a*b;
        System.out.print("multiplication is:");
        System.out.println(multiplication);

    }
}
