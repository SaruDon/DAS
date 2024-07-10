public class Practice {
    
    
    public static int fib(int n,int dp[]){
        if (n==1 || n==0 ) {
            return n;
        }
        if (dp[n]!=0) {
            return dp[n];
        }
        dp[n] = fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }

    /*
     
                 _
   n=2         _|
           x _|
      total no of ways =2
      
      n=1 1 way


                   _  
                 _|
   n=2         _|
           x _|
      total no of ways = 1-> 1,1,1 
                         2-> 1,2
                         3-> 2,1

                         */          


    public static int noOfways(int n){
        if (n==1 || n==2) {
            return n;
        }
        return noOfways(n-1)+noOfways(n-2);
    }

    public static int noOfWaysDpMemo(int n, int dp[]){
        if (n==1 || n==2) {
            return n;
        }
        if (dp[n]!=0) {
            return dp[n];
        }
        dp[n] = noOfWaysDpMemo(n-1, dp) + noOfWaysDpMemo(n-2, dp);
        return dp[n];
    }
    
    public static int noOfWaysDpTab(int n){
        //Create table/ Array
        int dp[] = new int [n+1];
        //Initialise
        dp[1]=1;
        dp[2]=2;
        //logic
        for (int i = 3; i < dp.length; i++) {
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[n];
    }



    public static int maxProfit(int val[], int weight[], int i, int tWt, int dp[][]){
        if (i==val.length || tWt == 0) {
            return 0;
        }
        if (dp[i][tWt]!=-1) {
            return dp[i][tWt];
        }
        if (tWt>= weight[i]) {
            int includeProfit = val[i] + maxProfit(val, weight, i+1, tWt-weight[i], dp);
            int excludeProfit = maxProfit(val, weight, i+1, tWt, dp);
            dp[i][tWt] = Math.max(includeProfit, excludeProfit);
            return dp[i][tWt] ;
        }else{
            dp[i][tWt] = maxProfit(val, weight, i+1, tWt,dp);
            return dp[i][tWt];
        }
    }   

    public static int maxProfitTab(int val[], int weight[],  int tWt){
        int dp[][]= new int[val.length+1][tWt+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] =0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1];
                int w = weight[i-1];
                if (j>=w) {
                    int inclu = v + dp[i-1][j-w];
                    int exlu = dp[i-1][j];
                    dp[i][j]= Math.max(inclu, exlu);
                }else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        return dp[val.length][tWt];
    }   
    


    private static boolean targetSum(int[] numbers, int target) {
        boolean dp[][]= new boolean[numbers.length+1][target+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]= true;
        }
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i]=false;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int no = numbers[i-1];
                if (no<=j  && dp[i-1][j-no]== true) {
                    dp[i][j]= true;
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[numbers.length][target];
    }

    
    public static void main(String[] args) {
        // int n =5;
        // int dp[] = new int [n+1];
        // // System.out.println(fib(n,dp));
        // // System.out.println(noOfWaysDpMemo(n,dp));
        // System.out.println(noOfWaysDpTab(n));


        // int val[] = {15,14,10,45,30};
        // int weight[] ={2,5,1,3,4};
        // int tWt =7;
        // int dp[][] =  new int [val.length+1][tWt+1];
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         dp[i][j]=-1;
        //     }
        // }
        // System.out.println(maxProfitTab(val, weight,  tWt));

        int numbers[]= {4,2,7,1,3};
        int targetSum = 20;
        System.out.println(targetSum(numbers,targetSum));
    }

    
}
