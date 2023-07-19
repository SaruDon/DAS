import java.util.*;
public class print_nos_in_reverse_order {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in reverse");
        int n =sc.nextInt();
        for( int i=n ; i>=1;i--){
            System.out.println(i);
        }
    }
}
