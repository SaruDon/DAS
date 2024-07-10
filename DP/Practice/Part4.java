public class Part4 {


    private static int maxProfit(int[] length, int[] price, int totalrod) {
        int dp[][] = new int[length.length+1][totalrod+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 || j==0) {
                    dp[i][j] =0;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j>=length[i-1]) {
                    int ans1 = price[i-1] + dp[i][j-length[i-1]];
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[length.length][totalrod];
    }

    /*
            "abcde";
            "ace"; 



     */

    private static int lcs(String str1, String str2, int n,int m) {
        if (n==0 || m==0) {
            return 0;
        }
        if (str1.charAt(n-1) == str2.charAt(m-1)) {
            return lcs(str1, str2, n-1, m-1)+1;
        }else{
            int ans1 = lcs(str1, str2, n-1, m); 
            int ans2 = lcs(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }
    

    private static int lcsDpMemo(String str1, String str2, int n,int m,int dp[][]) {
        if (n==0 || m==0) {
            return 0;
        }
        if (dp[n][m]!=-1) {
            return dp[n][m];
        }
        if (str1.charAt(n-1)== str2.charAt(m-1)) {
            dp[n][m] = lcsDpMemo(str1, str2, n-1, m-1,dp)+1;
            return dp[n][m];
        }else{
            dp[n][m] = Math.max(lcsDpMemo(str1, str2, n-1, m, dp), lcsDpMemo(str1, str2, n, m-1, dp));
            return dp[n][m];
        }
    }


    private static int lcsDpTab(String str1, String str2, int n,int m) {
        int dp[][] = new int[n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 || j==0 ) {
                    dp[i][j] =0;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1)== str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }


    private static int longestCommonStringDpTab(String str1, String str2, int n,int m) {
        int dp[][] = new int[n+1][m+1];
         int ans =0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 || j==0 ) {
                    dp[i][j] =0;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1)== str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }



    private static int editStringOp(String str1, String str2, int n, int m) {
        int dp[][]= new int[n+1][m+1];
        dp[0][0]=0;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1)== str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i][j-1]+1, Math.min(dp[i-1][j]+1, dp[i-1][j-1]+1));
                }
            }
        }
        return dp[n][m];
    }

/*
 
 */

    public static void main(String[] args) {
        // int length[]={1,2,3,4,5,6,7,8};
        // int price []= {1,5,8,9,10,17,17,20};
        // int totalrod =8;

        // System.out.println(maxProfit(length,price,totalrod));


        // String str1 ="abcde";
        // String str2 ="ace";
        // int n = str1.length();
        // int m = str2.length();
        // int dp[][] = new int[n+1][m+1];
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         if(i==0 ||j ==0){
        //             dp[i][j]=0;
        //         } 
        //         else{
        //           dp[i][j]=-1;
        //         }
        //     }
        // } 
        // System.out.println(lcs(str1,str2,n,m));
        // System.out.println(lcsDpMemo(str1,str2,n,m,dp));
        // System.out.println(lcsDpTab(str1, str2, n, m));



        // String str1 ="abcde";
        // String str2 ="abgce";
        // System.out.println(longestCommonStringDpTab(str1,str2,str1.length(),str2.length()));


        String str1 = "intention";
        String str2 = "execution";
        System.out.println(editStringOp(str1,str2,str1.length(),str2.length()));
    }

    
}
