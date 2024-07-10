public class Main2 {


    public static int maxProfit(int val[], int wt[], int tWt, int i){
        if (i==val.length || tWt==0) {
            return 0;
        }
        if (tWt>=wt[i]) {
            int ans1 = val[i] + maxProfit(val, wt, tWt-wt[i], i+1);
            int ans2  = maxProfit(val, wt, tWt, i+1);
            return Math.max(ans1, ans2);
        }
        return maxProfit(val, wt, tWt, i+1);
    }

    public static int maxProfitMemo(int val[], int wt[], int tWt, int i,int dp[][]){
        if (i==val.length || tWt==0) {
            return 0;
        }
        if (dp[i][tWt]!=-1) {
            return dp[i][tWt];
        }
        if (tWt>=wt[i]) {
            int ans1 = val[i] + maxProfitMemo(val, wt, tWt-wt[i], i+1,dp);
            int ans2  = maxProfitMemo(val, wt, tWt, i+1,dp);
            dp[i][tWt] = Math.max(ans1, ans2);
            return dp[i][tWt];
        }
        dp[i][tWt] = maxProfitMemo(val, wt, tWt, i+1,dp);
        return dp[i][tWt];
    } 


    public static int maxProfitTab(int val[], int wt[], int tWt){
        int dp[][]  = new int[val.length+1][tWt+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i==0 || j==0){
                    dp[i][j] =0;
                }else{
                    dp[i][j]=-1;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (wt[i-1]<=j) {
                    int ans1 = val[i-1]+ dp[i-1][j-wt[i-1]];
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[val.length][tWt];
    }

    private static boolean targetSum(int[] nums, int target) {
        boolean dp[][] = new boolean[nums.length+1][target+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (nums[i-1]<=j && dp[i-1][j-nums[i-1]]) {
                    dp[i][j] = true;
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[nums.length][target];
    }



    public static int unBoundedknapsack(int val[], int wt[], int tWt){
        int dp[][]  = new int[val.length+1][tWt+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 || j==0) {
                    dp[i][j] = 0;
                }else{
                    dp[i][j]=-1;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (wt[i-1]<=j) {
                    int ans1 = val[i-1] + dp[i][j-wt[i-1]];
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[val.length][tWt];
    }



    private static int maxValue(int[] length, int[] price, int rodLength) {
        int dp[][]  = new int[length.length+1][rodLength+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (i==0 || j==0) {
                    dp[i][j]=0;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (length[i-1]<=j) {
                    int ans1 = price[i-1] + dp[i][j-length[i-1]];
                    int ans2= dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[length.length][rodLength];
    }



    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[] ={2,5,1,3,4};
        int tWt = 7;
        int dp[][]  = new int[val.length+1][tWt+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0|| j==0) {
                    dp[i][j]=0;
                }else{
                    dp[i][j]=-1;
                }
            }
        }


        // int nums[] ={4,2,7,1,3};
        // int target =10;  
        // System.out.println(targetSum(nums, target));    
    
        // System.out.println(maxProfit(val, wt, tWt, 0));
        // System.out.println(maxProfitMemo(val,wt,tWt,1,dp));
        // System.out.println(maxProfitTab(val, wt, tWt));
        // System.out.println(unBoundedknapsack(val, wt, tWt));



        int length [] ={1,2,3,4,5,6,7,8};
        int price [] ={1,5,8,9,10,17,17,20};
        int rodLength = 8;
        System.out.println(maxValue(length, price,rodLength));
    }

    

    
}
