import java.util.Scanner;

public class avg_of_three_nos {

    public static float avg (int a, int b, int c){
        float avg = a+b+c/3;
        return avg;
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
        System.out.println("Aver age of three numbers is: "+avg(num1, num2, num3));
    }
}
