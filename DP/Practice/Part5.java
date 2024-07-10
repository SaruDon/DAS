import java.util.Arrays;

public class Part5 {
    
    
    /*
     c0=1,
     c1=1;
     c2=c0*c1 +c1*c0 = 2;
     c3=c0*c2+ c1*c1 + c2*C0 = 5;  
          2       1      2 


          
     */


    private static int caltalans(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans += caltalans(i) * caltalans(n-i-1);
        }
        return ans;
    }

    private static int caltalansDpMemo(int n, int dp[]) {
        if (n==0 || n==1) {
            return 1;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        int ans =0;
        for (int i = 0; i < n; i++) {
            ans += caltalansDpMemo(i, dp) * caltalansDpMemo(n-i-1, dp);
        }
        dp[n]= ans;
        return ans;
    }

    private static int caltalansDpTabu(int n) {
        int dp[]= new int[n+1];
        dp[0]=1;
        dp[1] =1;
        for (int i = 2; i < dp.length; i++) {
            int ans =0;
            for (int j = 0; j < i; j++) {
                ans += dp[j] * dp[i-1-j]; 
            }
            dp[i] = ans;
        }
        return dp[n];
    }

    
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int [n+1];
        dp[0]=1;
        dp[1]=1;
        Arrays.fill(dp, -1);
        System.out.println(caltalansDpTabu(n));
        System.out.println(caltalansDpMemo(n,dp));
        System.out.println(caltalans(n));
    }

    
}
