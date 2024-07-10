public class Main3 {

    public static int lCS(String str1, String str2, int n , int m){
        if (n==0 || m==0) {
            return 0;
        }
        if (str1.charAt(n-1)== str2.charAt(m-1)) {
            return lCS(str1, str2, n-1, m-1) + 1;
        }else{
            int ans1 = lCS(str1, str2, n-1, m);
            int ans2 = lCS(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }


    public static int lCSMemo(String str1, String str2, int n , int m, int dp[][]){
        if (n==0 || m==0) {
            return 0;
        }
        if (dp[n][m]!=-1) {
            return dp[n][m];
        }
        if (str1.charAt(n-1)== str2.charAt(m-1)) {
            dp[n][m] = lCSMemo(str1, str2, n-1, m-1,dp) + 1;
            return dp[n][m];
        }else{
            int ans1 = lCSMemo(str1, str2, n-1, m,dp);
            int ans2 = lCSMemo(str1, str2, n, m-1,dp);
            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];
        }
    }


    public static int lCSTab(String str1, String str2){
        int dp[][] = new int [str1.length()+1][str2.length()+1]; 
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 || j==0) {
                    dp[i][j]=0;
                }else{
                    dp[i][j]=-1;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }


    public static int subString(String str1, String str2, int n , int m){
        int ans =0;
        int dp[][] = new int[n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 || j==0) {
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
                    dp[i][j] =0;
                }
            }
        }
        return ans;
    }



    public static  int editDistance(String str1 , String str2){
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0) {
                    dp[i][j] = j;
                }          
                if (j==0) {
                    dp[i][j] =i;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j]+1, Math.min(dp[i][j-1]+1, dp[i-1][j-1]+1));
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }



    public static void main(String[] args) {
        // String str1 ="abcde";
        // String str2 ="ace";   
        // System.out.println(lCS(str1, str2, str1.length(), str2.length()));

        // int dp[][]  = new int[str1.length()+1][str2.length()+1];
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         if (i==0 || j==0) {
        //             dp[i][j]=0;
        //         }else{
        //             dp[i][j]=-1;
        //         }
        //     }
        // }

        // System.out.println(lCSMemo(str1, str2, str1.length(), str2.length(), dp));
        // System.out.println(lCSTab(str1, str2));
        // String str1 ="ABCDE";
        // String str2 = "ABGCE";
        // System.out.println(subString(str1, str2, str1.length(), str2.length()));


        String str1  ="intention";
        String str2 = "execution";
        System.out.println(editDistance(str1, str2));


        
    }
}
