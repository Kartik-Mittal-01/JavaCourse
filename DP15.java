
public class DP15 {

    // TABULATION 
    public static int CatalanTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                dp[i] += (dp[j] * dp[i - j - 1]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

        // MOUNTAIN RANGES ( VARAITION OF CATALAN's NUMBER)
        //(*NUMBER OF UPSTROKES ARE ALWAYS GREATER THAN NUMBER OF DOWNSTROKES)
        // n is the number of pair of upstrokes(/) and downstrokes(\)
        int n = 4;
        System.out.println("NUMBER OF MOUNTAIN RANGES ARE : " + CatalanTab(n));

    }
}
