import java.util.Scanner;

public class bill_maker {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil");
        int a =sc.nextInt();
        System.out.println("Enter cost of pen");
        int b =sc.nextInt();
        System.out.println("Enter cost of eraser");
        int c =sc.nextInt();
        float Total_bill = a+b+c;
        double Gst= Total_bill+Total_bill*.18;

        System.out.print("Total bill is:");
        System.out.print(Total_bill);
        System.out.println(" ");
        System.out.print("Bill with GST:");
        System.out.print(Gst);
         
    }
}
