
public class DP16 {
    // RECURSION 

    public static int MCM(int arr[], int i, int j) {
        if (i == j) {
            return 0;
        }
        int cost = Integer.MAX_VALUE;
        /* 
                     arr[0] X arr[1] X arr[2]..arr[3] X arr[4]
                          \  /      \  /            \  /
                          A(1)      A(2) .........  A(4) 
                          |           |                |
                          i           k                j
         */
        for (int k = i; k <= j - 1; k++) {
            int cost1 = MCM(arr, i, k); // --> Ai x Ai+1 x ...Ak => final matrix size : (arr[i-1]xarr[k])
            int cost2 = MCM(arr, k + 1, j); // --> Ak+1 x Ak+2 .. Aj => final matrix size : (arr[k]Xarr[j])
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            cost = Math.min(cost, cost1 + cost2 + cost3);
        }
        return cost;
    }

    // MEMOISATION 
    public static int MCMMemo(int arr[], int i, int j, int dp[][]) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = MCMMemo(arr, i, k, dp);
            int cost2 = MCMMemo(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(ans, cost1 + cost2 + cost3);
        }
        return dp[i][j] = ans;

    }

    // TABULATION
    public static int MCMTab(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        //BASE CASE 
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        for (int l = 2; l <= n - 1; l++) {
            for (int i = 1; i <= n - l; i++) {
                int j = (i + l - 1);
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);

                }
            }
        }
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        // MCM ( MATRIX CHAIN MULTIPLICATION )
        int arr[] = {1, 2, 3, 4, 3};

        //RECURSION 
        System.out.println(MCM(arr, 1, arr.length - 1));

        // MEMOISATION
        int n = arr.length;
        int dp[][] = new int[n][n];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(MCMMemo(arr, 1, arr.length - 1, dp));

        //TABULATION 
        System.out.println(MCMTab(arr));

    }
}
