public class WildCardMatching {

    public static boolean isPatternMatch(String str1, String str2){
        boolean dp[][]  = new boolean [str1.length()+1][str2.length()+1];
        //tnitialisation
        dp[0][0] = true;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0]= false;
        }
        for (int i = 1; i < dp[0].length; i++) {
            if (str2.charAt(i-1)=='*') {
                dp[0][i] = dp[0][i-1];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i-1)== str2.charAt(j-1) || str2.charAt(j-1)=='?') {
                    dp[i][j] = dp[i-1][j-1]; 
                }else if (str2.charAt(j-1)=='*') {
                    dp[i][j] = dp[i-1][j] || dp[i
                    
                    ][j-1]; 
                }else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }




    public static void main(String[] args) {
       String str1 ="baaabab";
       String str2 ="*****ba*****ab"; 
       System.out.println(isPatternMatch(str1, str2));
    }
}
