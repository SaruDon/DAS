<<<<<<< HEAD
public class quetion_three {

    public static int stocks(int rs[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < rs.length; i++) {
            if (buyPrice < rs[i]) {
                int currentProfit = rs[i] - buyPrice;
                maxProfit += currentProfit;
            } else {
                buyPrice = rs[i];

            }
        }
        return maxProfit;

    }

    public static void main(String arg[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stocks(prices));
    }
}
=======
public class quetion_three {

    public static int stocks(int rs[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < rs.length; i++) {
            if (buyPrice < rs[i]) {
                int currentProfit = rs[i] - buyPrice;
                maxProfit += currentProfit;
            } else {
                buyPrice = rs[i];

            }
        }
        return maxProfit;

    }

    public static void main(String arg[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stocks(prices));
    }
}
>>>>>>> 5f7b76f325310b072c0710ea99305cfd482d2e1f
