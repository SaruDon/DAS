<<<<<<< HEAD
import java.util.Scanner;

public class calculator {
    public static void main (String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter numbers");
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.print("'+' for addtion\n '-' for subtration of two numbers\n '*' for multiplication of two numbers\n '/' for division of two numbers\n '%' for Modulus of two numbers\n");
        char operator =sc.next().charAt(0);
    
        switch(operator){
            case '+':
            int sum =a+b;
            System.out.println("Sum is:"+sum);
            break;

            case '-':
            int sub =a-b;
            System.out.println("subtraction is:"+sub);
            break;

            case '*':
            int multi =a*b;
            System.out.println("Multiplication is:"+multi);
            break;

            case '/':
            int div =a/b;
            System.out.println("Division is:"+div);
            break;

            case '%':
            int mod =a%b;
            System.out.println("Mod is:"+mod);
            break;

            default:
            System.out.println("Thank you");

    }    
    }
    
}
=======
import java.util.Scanner;

public class calculator {
    public static void main (String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter numbers");
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.print("'+' for addtion\n '-' for subtration of two numbers\n '*' for multiplication of two numbers\n '/' for division of two numbers\n '%' for Modulus of two numbers\n");
        char operator =sc.next().charAt(0);
    
        switch(operator){
            case '+':
            int sum =a+b;
            System.out.println("Sum is:"+sum);
            break;

            case '-':
            int sub =a-b;
            System.out.println("subtraction is:"+sub);
            break;

            case '*':
            int multi =a*b;
            System.out.println("Multiplication is:"+multi);
            break;

            case '/':
            int div =a/b;
            System.out.println("Division is:"+div);
            break;

            case '%':
            int mod =a%b;
            System.out.println("Mod is:"+mod);
            break;

            default:
            System.out.println("Thank you");

    }    
    }
    
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
