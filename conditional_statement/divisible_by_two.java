import java.util.Scanner;

public class divisible_by_two {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number:");
        int a =sc.nextInt();
        if (a%2==0) {
            System.out.println("even");
            
        } else {
            System.out.println("odd");
        }
    }
        
    }
