import java.util.Scanner;

public class factorial1 {
    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n;i++){
        fact *=i;
        }
        return fact;
    }
    public static void main(String arg[]) {
     Scanner sc =new Scanner(System.in);
     int a = sc.nextInt();
     System.out.println(factorial(a));
    }
}
