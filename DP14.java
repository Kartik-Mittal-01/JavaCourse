
public class DP14 {

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

        // COUNT THE NUMBER OF BST's ( VARIATION OF CATALAN'S NUMBER )
        //IF NUMBER OF NODES IN THE BST IS "n" THEN THE NUMBER OF BSTS ARE : Catalan(n)
        int nodes = 4;
        System.out.println("NUMBER OF TOTAL BST's ARE: " + CatalanTab(nodes));
    }
}
