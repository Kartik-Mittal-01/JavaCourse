
public class DP4 {

    // UNBOUNDED KNAPSACK CODE WITH TABULATION 
    public static int KnapsackTab(int val[], int wt[], int Weight) {
        int n = val.length;
        int dp[][] = new int[n + 1][Weight + 1];   // (ROWS STORES THE n AND COLUMN STORES THE WEIGHT OF KNAPSACK)
        for (int j = 0; j < dp[0].length; j++) {       // BASE CASE :  n=0
            dp[0][j] = 0;
        }
        for (int i = 0; i < dp.length; i++) {     // BASE CASE : W=0
            dp[i][0] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int V = val[i - 1];     // value of the item 
                int W = wt[i - 1];      // weight of the item 
                if (W <= j) {
                    int ans1 = V + dp[i][j - W];                  // ----> UNBOUNDED KNAPSACK THERE IS A SMALL CHANGE
                    int ans2 = dp[i - 1][j];                      //       HERE dp[i][j-W] is there instead of dp[i-1][j-W]
                    dp[i][j] = Math.max(ans1, ans2);

                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][Weight];

    }

    public static void main(String[] args) {

        // 0-1 UNBOUNDED KNAPSACK ( max profit ?)
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        //TABULATION 
        System.out.println(KnapsackTab(val, wt, W));

    }

}
