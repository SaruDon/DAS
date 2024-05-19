public class RodCut{
    
    
    public static int maxVal(int lenght[],int price[], int rodlength){
        int dp[][]= new int[lenght.length+1][rodlength+1];
        for(int i =0; i<dp.length;i++){
            for (int j = 0; j < dp.length; j++) {
                if (i==0 || j==0) {
                    dp[i][j]=0;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int p = price[i-1];
                int lr = lenght[i-1];
                if (j>=lr) {
                    int ans1 = p + dp[i][j-lr];
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }else{
                    int exclude = dp[i-1][j];
                    dp[i][j]=exclude;
                }
            }
        }
        return dp[lenght.length][rodlength];
    }


    public static void main(String[] args) {
        int lenght[]={1,2,3,4,5,6,7,8};    
        int price[]={1,5,8,9,10,17,17,20};
        int rodlength =8;
        System.out.println(maxVal(lenght,price,rodlength));
    }
}