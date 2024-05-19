import java.util.Arrays;

public class Main{
    
    
    
    public static int maxprofit(int val[], int wt[], int twt, int i){
        if (i==val.length || twt==0) {
            return 0;
        }
        if (twt>=wt[i]) {
            int ans1 = val[i]+maxprofit(val, wt, twt-wt[i], i+1);
            int ans2 = maxprofit(val, wt, twt, i+1);
            return Math.max(ans1, ans2);
        }
        return maxprofit(val, wt, twt, i+1);
    }    


    public static int maxprofitDpMemo(int val[], int wt[], int i, int twt, int dp[][]){
        if (i == val.length || twt==0) {
            return 0;
        }
        if (dp[i][twt]!=-1) {
            return dp[i][twt];
        }
        if (twt>=wt[i]) {
            int ans1 = val[i] + maxprofitDpMemo(val, wt,i+1,twt-wt[i],dp);
            int ans2 = maxprofitDpMemo(val, wt, i+1, twt, dp);
            dp[i][twt] = Math.max(ans1, ans2);
            return dp[i][twt];
        }
        int exclude  = maxprofitDpMemo(val, wt, i+1, twt, dp);
        dp[i][twt] = exclude;
        return dp[i][twt] ;
    } 

    public static int maxprofitDpTab(int[] val, int[] wt, int twt) {
        int dp[][]= new int[val.length+1][twt+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1];
                int w = wt[i-1];
                if (w<=j) {
                    int ans1 = v + dp[i-1][j-w];
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    int exclude = dp[i-1][j];
                    dp[i][j] = exclude;
                }
            }
        }
        return dp[val.length][twt];
    }

    public static int editDistance(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int [n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (i==0) {
                    dp[i][j]=j;
                }
                if (j==0) {
                    dp[i][j]=i;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1)== str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int add = dp[i][j-1]+1;
                    int delete = dp[i-1][j]+1;
                    int replace = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(add,Math.min(replace,delete));
                }
            }
        }
        return dp[n][m];
    }


    public static void main(String[] args) {
        // int val []={15,14,10,45,30};
        // int wt[] ={2,5,1,3,4};   
        // int twt = 7;
        // // int dp[][] = new int[val.length+1][twt+1];
        // // for (int i = 0; i < dp.length; i++) {
        // //     for (int j = 0; j < dp[0].length; j++) {
        // //         dp[i][j]=-1;
        // //     }
        // // }
        // // for (int i = 0; i < dp[0].length; i++) {
        // //     dp[0][i]=0;
        // // }
        // // for (int i = 0; i < dp.length; i++) {
        // //     dp[i][0]=0;
        // // }
        // // System.out.println(maxprofit(val, wt, twt, 0));
        // // System.out.println(maxprofitDpMemo(val, wt,1,twt,dp));

        // System.out.println(maxprofitDpTab(val,wt,twt));   
        String str1 ="intention";
        String str2 = "execution";
        System.out.println(editDistance(str1, str2));

    }


    
}