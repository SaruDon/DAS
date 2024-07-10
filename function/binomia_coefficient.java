<<<<<<< HEAD
import java.util.Scanner;

public class binomia_coefficient {

    public static int factorial(int x){
        int fact=1;
        for(int i=1; i<=x;i++){
            fact*=i;
        }
        return fact;
    }
    
    public static int binomial(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int factnr = factorial(n-r);

        int ans = fact_n/(fact_r * factnr);
        return ans;
    }
    public static void main (String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int a = sc.nextInt();
        System.out.println("Enter value of r");
        int b = sc.nextInt();
        System.out.println("ans is  "+binomial(a, b));
    }
}
=======
import java.util.Scanner;

public class binomia_coefficient {

    public static int factorial(int x){
        int fact=1;
        for(int i=1; i<=x;i++){
            fact*=i;
        }
        return fact;
    }
    
    public static int binomial(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int factnr = factorial(n-r);

        int ans = fact_n/(fact_r * factnr);
        return ans;
    }
    public static void main (String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int a = sc.nextInt();
        System.out.println("Enter value of r");
        int b = sc.nextInt();
        System.out.println("ans is  "+binomial(a, b));
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
