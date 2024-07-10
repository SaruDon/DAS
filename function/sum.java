import java.util.Scanner;

public class sum {

    public static int culculatesum(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    public static void main (String arg []){
    Scanner sc = new Scanner(System.in);  
    int a = sc.nextInt();
    int b = sc.nextInt();
    int addition = culculatesum(a,b);
    System.out.println(addition);
    }
}
