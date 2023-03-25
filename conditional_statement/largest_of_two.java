import java.util.Scanner;

public class largest_of_two {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(+a+" is grater than "+b);
        }
        else{
            System.out.println(+b+" is grater than "+a);
        }

    }
    
}
