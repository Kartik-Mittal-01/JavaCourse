
public class ARRAY12 {

    public static int MaxProfit(int cost[]) {
        int maxProfit = 0;
        for (int cp = 1; cp <= cost.length; cp++) {
            for (int sp = cp; sp <= cost.length; sp++) {
                int profit = (sp - cp);
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        if (maxProfit > 0) {
            return maxProfit;
        } else {
            return 0;
        }
    }

    //METHOD 2
    public static int BuyAndSell(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                buyprice = price[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        // STOCK MARKET PROFIT!
        int cost[] = {7, 1, 5, 3, 6, 4};
        System.out.println("MAXIMUM PROFIT IS: " + MaxProfit(cost));
    }
}
