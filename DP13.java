
import java.util.Arrays;

public class DP13 {

    //RECURSION 
    public static int Catalan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (Catalan(i) * Catalan(n - i - 1));
        }
        return ans;
    }

    //MEMOISATION
    public static int CatalanMemo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (CatalanMemo(i, dp) * CatalanMemo(n - i - 1, dp));
        }
        return dp[n] = ans;

    }

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

        // CATALAN NUMBER 
        int n = 4;

        //RECURSION
        System.out.println("C4 is: " + Catalan(n));

        //RECURSION
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("C4 is: " + CatalanMemo(n, dp));

        // TABULATION 
        System.out.println("C4 is :" + CatalanTab(n));

    }
}
