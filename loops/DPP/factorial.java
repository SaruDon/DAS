import java.util.Scanner;

public class factorial {
     public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number you want factorial of:");
        int n  = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=n;i++){
            fact *= i; 
        }
        System.out.println("factorial is:"+fact);
     }
   

    
}
