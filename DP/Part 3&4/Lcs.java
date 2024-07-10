public class Lcs {
    
    
    public static int lcs(String str1, String str2, int n , int m ){
        if (n==0 || m==0) {
            return 0;
        }
        if (str1.charAt(n-1)==str2.charAt(m-1)) {
            return lcs(str1, str2, n-1, m-1)+1;
        }else{
            int ans1 = lcs(str1, str2, n-1, m);
            int ans2 = lcs(str1,str2,n,m-1);
            return Math.max(ans1, ans2);
        }
    }

    public static int lcsDpMemo(String str1, String str2, int n , int m, int dp[][] ){
        if (n==0 || m==0) {
            return 0;
        }
        if (dp[n][m]!=-1) {
            return dp[n][m];
        }
        if (str1.charAt(n-1)==str2.charAt(m-1)) {
            dp[n][m] = lcsDpMemo(str1, str2, n-1, m-1,dp)+1;
            return dp[n][m];
        }else{
            int ans1 = lcsDpMemo(str1, str2, n-1, m,dp);
            int ans2 = lcsDpMemo(str1,str2,n,m-1,dp);
            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];
        }
    }


    
    public static int lcsDpTab(String str1, String str2, int n , int m){
        int dp[][]=new int[n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=0;
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp [i][j]= Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    
    
    
    public static int stringConversion(String str1, String str2){
        return str1.length()-lcsDpTab(str1, str2, str1.length(), str2.length())+ str2.length()-lcsDpTab(str1, str2, str1.length(), str2.length());
    }


    public static void main(String[] args) {
        String str1 = "abcdge";
        int n = str1.length();
        String str2= "abedg";
        int m = str2.length();
        int dp[][]=new int[n+1][m+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        // System.out.println(lcs( "abcdge","abedg",6,5));
        // System.out.println(lcsDpMemo(str1,str2,n,m,dp));
        // System.out.println(lcsDpTab(str1,str2,n,m));
        System.out.println(stringConversion("pear", "sea"));
    }
}
