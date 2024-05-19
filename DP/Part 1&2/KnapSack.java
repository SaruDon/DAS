import java.lang.reflect.Array;
import java.util.Arrays;

public class KnapSack {


    public static int totalProfit(int val[], int weight[],int i ,int tWt, int dp[][]){
        if (i==val.length || tWt==0) {
            return 0;
        }
        if (dp[i][tWt]!=-1) {
            return dp[i][tWt];
        }
        if (tWt>=weight[i]) {
            int ans1= val[i] +totalProfit(val, weight, i+1, tWt- weight[i],dp);
            int ans2 = totalProfit(val, weight, i+1, tWt,dp);
            dp[i][tWt]= Math.max(ans1, ans2);
            return dp[i][tWt];  
        }
        dp[i][tWt] = totalProfit(val, weight, i+1, tWt,dp);
        return dp[i][tWt];
    }


    public static int profitTabula(int val[], int weight[],int tWt){
        int n = val.length;
        int dp[][] = new int[n+1][tWt+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1];
                int w = weight[i-1];
                if (w<=j) {//valid condition
                    //include profit
                    int incProfit = v+dp[i-1][j-w];
                    int exclude = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, exclude);
                }else{
                    int exclude = dp[i-1][j];
                    dp[i][j] = exclude;
                }
            }
        }
        return dp[n][tWt];
    }


    public static int profitTabulaUnbounded(int val[], int weight[],int tWt){
        int n = val.length;
        int dp[][] = new int[n+1][tWt+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = val[i-1];
                int w = weight[i-1];
                if (w<=j) {//valid condition
                    //include profit
                    int incProfit = v+dp[i][j-w];
                    int exclude = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, exclude);
                }else{
                    int exclude = dp[i-1][j];
                    dp[i][j] = exclude;
                }
            }
        }
        return dp[n][tWt];
    }


    

    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int weight[] ={2,5,1,3,4};
        int tWt =7;
        int dp[][] =  new int [val.length+1][tWt+1];
        
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        // System.out.println(totalProfit(val, weight, 0, tWt,dp));
        System.out.println(profitTabulaUnbounded(val, weight, tWt));
    }
    
 }
