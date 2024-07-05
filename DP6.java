
public class DP6 {

    public static int Rodcut(int length[], int price[], int totallength) {
        // rows stores the number of piece
        // column stores the total length 
        // each cell stores the price to sell i piece of a rod of total length j
        int dp[][] = new int[length.length + 1][totallength + 1];
        // when number of piece is 0
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        // when the total length is 0
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], price[i - 1] + dp[i - 1][j - length[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];

                }

            }
        }
        return dp[length.length][totallength];

    }

    public static void main(String[] args) {

        // ROD CUTTING PROBLEM ( VARIATION OF UNBDD KNAPSACK PROBLEM )
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int totallength = 8;
        System.out.println(Rodcut(length, price, totallength));

    }
}
