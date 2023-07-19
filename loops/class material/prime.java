import java.util.Scanner;

public class prime{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
            System.out.println("non prime");
            break;
        }
        else{
            System.out.println("prime");
            break;
        }
    }
}
}
