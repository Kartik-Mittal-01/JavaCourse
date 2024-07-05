
public class DP3 {

    // TABULATION 
    // ROWS -> item 
    // COLUMN -> TargetSum 
    public static boolean TargetSum(int num[], int Target) {
        boolean dp[][] = new boolean[num.length + 1][Target + 1];

        // IF TARGET=0 -> there is a always a subset whose targetsum is 0.
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        // IF THE num[] is empty then then it is not possible to get the non zero target sum 
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = false;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int V = num[i - 1];

                if (V <= j) {
                    if (dp[i - 1][j - V]) {   // INCLUDE CONDITION 
                        dp[i][j] = true;
                    }
                } else if (dp[i - 1][j]) {    // EXCLUDE CONDITION 
                    dp[i][j] = true;

                }

            }
        }
        return dp[num.length][Target];

    }

    public static void main(String[] args) {

        // TARGET SUM SUBSET ( VARIATION OF 0-1 KNAPSACK )
        int num[] = {4, 2, 7, 1, 3};
        int Target = 10;
        System.out.println(TargetSum(num, Target));

    }
}
