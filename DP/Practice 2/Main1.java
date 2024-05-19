import java.lang.reflect.Array;
import java.util.Arrays;

public class Main1{
    
    
    public static int fib(int n){
        // base
        if (n==0 || n==1) {
            return n;
        }
        return fib(n-1)+ fib(n-2);
    }

    public static int fibDp(int n, int dp[]){
        // base
        if (n==0 || n==1) {
            return n;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        dp[n] = fib(n-1)+ fib(n-2);
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n =6;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n));
        System.out.println(fibDp(n,dp));
    }   
}
