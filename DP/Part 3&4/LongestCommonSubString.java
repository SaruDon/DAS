public class LongestCommonSubString {


    private static int lcs(String str1, String str2, int n, int m) {
        int dp[][] = new int[n+1][m+1];
        int ans = 0;
        for(int i=0; i<dp.length;i++){
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 || j==0) {
                    dp[i][j]=0;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1)== str2.charAt(j-1)) {
                    dp[i][j]= dp[i-1][j-1]+1;
                    ans  = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j]= 0;
                }
            }
        }
        return ans;
    }




    public static void main(String[] args) {
       String str1 = "abcde";
       String str2 = "abgce"; 
       int n =str1.length();
       int m = str2.length();

       System.out.println(lcs(str1,  str2,  n,  m));
    }

    
}
