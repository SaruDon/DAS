import java.util.Scanner;

public class tabel {
    public static void main (String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
         int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            int tabel=i*n;
            System.out.println(+n+" X "+i+" = "+tabel);
        }
    }
}
