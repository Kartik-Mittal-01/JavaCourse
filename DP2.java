
public class DP2 {

    //RECURSION
    public static int Knapsack(int val[], int wt[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        // nth item is stored at (n-1)th index of wt[] , (1st item is at index 0)
        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + Knapsack(val, wt, W - wt[n - 1], n - 1);
            int ans2 = Knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);

        } else {
            return Knapsack(val, wt, W, n - 1);
        }
    }

    //MEMOISATION
    public static int KnapsackMemo(int val[], int wt[], int W, int n, int dp[][]) {

        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            dp[n][W] = Math.max(val[n - 1] + KnapsackMemo(val, wt, W - wt[n - 1], n - 1, dp), KnapsackMemo(val, wt, W, n - 1, dp));

        } else {
            dp[n][W] = KnapsackMemo(val, wt, W, n - 1, dp);
        }

        return dp[n][W];

    }

    // TABULATION 
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
                    int ans1 = V + dp[i - 1][j - W];
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);

                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][Weight];

    }

    public static void main(String[] args) {

        // 0-1 KNAPSACK ( max profit ?)
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        // RECURSION 
        System.out.println(Knapsack(val, wt, W, 5));

        // MEMOISATION 
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(KnapsackMemo(val, wt, W, 5, dp));

        //TABULATION 
        System.out.println(KnapsackTab(val, wt, W));

    }

}
