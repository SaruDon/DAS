import java.util.Scanner;

public class break_ex {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        
        
        do{
            int a = sc.nextInt();
            if(a%10==0){
                break;
            }   
            System.out.println(a);
        }while(true);

    }
}
