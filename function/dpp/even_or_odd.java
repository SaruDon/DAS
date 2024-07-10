package dpp;

import java.util.Scanner;

public class even_or_odd {
    boolean ans = false;
    public static boolean isEven(int n) {
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String arg []) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }
}
