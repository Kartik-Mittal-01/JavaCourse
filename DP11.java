
public class DP11 {

    // TABULATION 
    public static int LCSTab(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];

    }

    public static void Steps(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int x = LCSTab(str1, str2);
        System.out.println("NUMBER OF DELETE OPERATIONS: " + (n - x));
        System.out.println("NUMBER OF INSERT OPERATIONS: " + (m - x));
    }

    public static void main(String[] args) {

        // STRING CONVERSION ( WITH ONLY INSERTION AND DELETION )
        // one simple step is requiresd => str1 -> LCS(str1,str2) - > str2 
        String str1 = "abcdef";
        String str2 = "aceg";
        Steps(str1, str2);

    }
}
