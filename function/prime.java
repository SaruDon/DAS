import java.util.Scanner;

public class prime {

    public static int prime(int n){
        for(int i=2;i<=n; i++){
            if(n%i==0){
                System.out.println("Non prime");
                break;
            }
            else{
                System.out.println("Number is prime");
                break;
            }
        }
        return 0;
    }
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        System.out.println(prime(a));
    }
}
