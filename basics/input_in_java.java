import java.util.*;
public class input_in_java {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
       /* String name =sc.next();
        System.out.println(name); */ // for enterting a word we use sc.next

       String name = sc.nextLine();
       System.out.println(name); 


    }
}
