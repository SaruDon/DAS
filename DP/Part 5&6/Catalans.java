import java.util.Arrays;

public class Catalans{
    

    private static int catalans(int n) {
        if (n==1 || n==0) {
            return 1;
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans += catalans(i) * catalans(n-i-1);
        }
        return ans;
    }

    private static int catalansDpMemo(int n, int dp[]) {
        if (n==1 || n==0) {
            return 1;
        }
        if (dp[n]!=-1) {
            return dp[n];
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans += catalansDpMemo(i,dp) * catalansDpMemo(n-i-1,dp);
        }
        dp[n]= ans;
        return dp[n];
    }

    private static int catalansDptab(int n) {
        int dp[] = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            int ans = 0;
            for (int j = 0; j < i; j++) {
                ans += dp[j] *dp[i-j-1];
            }
            dp[i] = ans;
        }
        return dp[n];
    }
    
    
    
    public static void main(String[] args) {
        int n =4;
        int dp [] = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        Arrays.fill(dp, -1);
        // System.out.println(catalans(n));    
        // System.out.println(catalansDpMemo(n, dp));
        System.out.println(catalansDptab(n));
    }

    
}