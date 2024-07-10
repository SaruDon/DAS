import java.util.Arrays;

public class Main4 {
    
    
    public static int catalansNo(int n,int dp[]){
        if (n==0 || n==1) {
            return 1;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
             ans += catalansNo(i,dp)* catalansNo(n-i-1,dp);
        }
        dp[n]= ans;
        return ans;
    }

     public static int tabulationDp(int n){
        int dp[] = new int [n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            int ans =0;
            for (int j = 0; j < i; j++) {
                ans += dp[j]*dp[i-j-1];
            }
            dp[i] = ans;
        }
        return dp[n];
     }
    
    public static void main(String[] args) {
        int n= 3;
        int dp[] = new int [n+1];
        Arrays.fill(dp, -1);
        System.out.println(catalansNo(n,dp));
        System.out.println(tabulationDp(n));
    }
}
