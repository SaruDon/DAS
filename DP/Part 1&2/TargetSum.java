public class TargetSum {
    
    
    public static  boolean targetSum(int val[], int sum){
        boolean dp[][] = new boolean[val.length+1][sum+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=true;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1];
                if (v<=j && dp[i-1][j-v]) {
                    dp[i][j]= true;
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[val.length][sum];
    }
    
    public static void main(String[] args) {
        int val[]= {4,2,7,3,1};
        int targetSum =10;
        System.out.println(targetSum(val,targetSum));
    }
}
