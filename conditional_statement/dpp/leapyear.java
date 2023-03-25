import java.util.*;

public class leapyear {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("It's is not leap year"); 
        }

    }    
}
