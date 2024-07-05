
public class DP17 {

    public static int MP(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int W = sum / 2;
        int dp[][] = new int[n + 1][W + 1];
        //BASE CASE 
        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         if (i == 0 || j == 0) {
        //             return 0;
        //         }
        //     }
        // }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                //include
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], arr[i - 1] + dp[i - 1][j - arr[i - 1]]);

                } //exclude
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);

    }

    public static void main(String[] args) {

        // MINIMUM PARTITIONING 
        int arr[] = {1, 6, 11, 5};
        System.out.println("MINIMUM PARTITION DIFFERENCE FOR THE GIVEN ARRAY IS: " + MP(arr));

    }
}
