import java.util.Scanner;
import java.util.*;

public class print_nos_from_one_to_n {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int i =1;

        while(i<=n){
            System.out.println(i);
            i++;
        }
    }    
}
