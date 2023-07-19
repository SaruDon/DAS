import java.util.Scanner;

public class multiplication {
    public static int mult(int num1, int num2){
        int ans = num1*num2;
        
        return ans;
    }
    public static void main(String arg []){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 1st number");
        int a =sc.nextInt();
        System.out.println("enter 2nd number");
        int b =sc.nextInt();
        
        System.out.println("ans is  "+mult(a,b));

    }
}
