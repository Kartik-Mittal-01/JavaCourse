
public class DP10 {

    public static int EditDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                // same character 
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = 0 + dp[i - 1][j - 1];
                } else {
                    // different character 
                    int add = dp[i][j - 1] + 1;
                    int remove = dp[i - 1][j] + 1;
                    int replace = dp[i - 1][j - 1] + 1;
                    dp[i][j] = Math.min(add, Math.min(remove, replace));
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {

        // EDIT DISTANCE CODE
        String word1 = "intention";
        String word2 = "execution";
        System.out.println(EditDistance(word1, word2));
    }
}
