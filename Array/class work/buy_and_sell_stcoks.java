public class buy_and_sell_stcoks {

    public static int maxprofit(int rs[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < rs.length; i++) {
            if (buyPrice < rs[i]) {
                int profit = rs[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = rs[i];
            }
        }
        return maxProfit;
    }

    public static void main(String arg[]) {
        int price[] = { 7, 1, 5, 6, 4 };
        System.out.println(maxprofit(price));
    }
}
