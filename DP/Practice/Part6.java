import java.util.Arrays;

public class Part6 {
    
    
    public static int minCost(int arr[], int i ,int j){
        if (i==j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {
            int cost1 = minCost(arr, i, k);  //resultant = arr[i-1] * arr[k] 
            int cost2 = minCost(arr, k+1, j); //resultant = arr[k] * arr[j] 
            int cost3  = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 +cost2  +cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }


    public static int minCostMemo(int arr[], int i ,int j, int dp[][]){
        if (i==j) {
            return 0;
        }
        if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {
            int cost1 = minCost(arr, i, k);  //resultant = arr[i-1] * arr[k] 
            int cost2 = minCost(arr, k+1, j); //resultant = arr[k] * arr[j] 
            int cost3  = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 +cost2  +cost3;
            ans = Math.min(ans, finalCost);
        }
        return dp[i][j] = ans;
    }


    public static int minCostTab(int arr[]){
        int dp[][] = new int[arr.length][arr.length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 ||j==0) {
                    dp[i][j] =0;
                }
                if (i==j) {
                    dp[i][j] =0;
                }
            }
        }
        for (int length = 2; length <= dp.length-1; length++) {
            for (int i = 1; i <= dp.length-length; i++) {
                int j = i+length-1;
                dp[i][j]= Integer.MAX_VALUE;
                for (int k = i; k <= j-1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }
        return dp[1][arr.length-1];
    }
    
    
    
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3};
        int n = arr.length;
         int dp[][] = new int [n][n];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(minCost(arr, 1, n-1));
        System.out.println(minCostMemo(arr, 1, n-1, dp));
        System.out.println(minCostTab(arr));
    }
}
