import java.util.*;

public class print_no_in_reverse {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in ");
        int n =sc.nextInt();

        while( n>0 ){
            int latsdigit = n%10;
            System.out.print(latsdigit);
            n = n/10;
        }
    }
}


