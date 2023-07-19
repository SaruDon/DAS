public class stock {
    public static int  profit(int rs[]) {
        int buyPrice =Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<rs.length;i++){
            if(buyPrice < rs[i]){
                int profit = rs[i]-buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice =rs[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price [] ={7,1,5,3,6,4};
        System.out.println(profit(price));

    }
}
