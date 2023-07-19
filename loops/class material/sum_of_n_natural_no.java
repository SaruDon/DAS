import java.util.*;

public class sum_of_n_natural_no {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till u want sum of:");
        int n = sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n){
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
    }    
}
