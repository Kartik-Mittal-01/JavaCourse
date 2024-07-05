
public class DP5 {

    public static int CoinChange(int coins[], int sum) {
        // rows -> coins
        // column -> sum
        // each cell stores the number of ways to get the sum j with i coins 
        int dp[][] = new int[coins.length + 1][sum + 1];

        // when the sum is 0
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        // when there are no coins available
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                // number on the coin is 'coins[i-1]''
                // weight of knapsack (or sum) is 'j'
                if (coins[i - 1] <= j) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - coins[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        return dp[coins.length][sum];
    }

    public static void main(String[] args) {

        // COIN CHANGE PROBLEM ( variation of unbounded knapsack)
        int coins[] = {1, 2, 3};
        int sum = 4;
        System.out.println(CoinChange(coins, sum));
    }
}
