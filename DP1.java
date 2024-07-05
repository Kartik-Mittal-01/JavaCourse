
import java.util.Arrays;

public class DP1 {

    // RECURSION 
    public static int WaysRec(int n) {
        if (n == 0) {
            return 1;  // BASE CASE 
        }
        if (n < 0) {
            return 0;  // BASE CASE 
        }
        return WaysRec(n - 1) + WaysRec(n - 2);
    }

    // MEMOISATION
    public static int WaysMemo(int n, int Ways[]) {

        if (n == 0) {
            return 1;  // BASE CASE 
        }
        if (n < 0) {
            return 0;  // BASE CASE 
        }
        if (Ways[n] != -1) {
            return Ways[n];
        }
        Ways[n] = WaysMemo(n - 1, Ways) + WaysMemo(n - 2, Ways);
        return Ways[n];
    }

    // TABULATION 
    public static int WaysTab(int n) {
        int ways[] = new int[n + 1];
        ways[0] = 1; // BASE CASE 
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ways[i] = ways[i - 1];
            } else {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
        }
        return ways[n];
    }

    public static void main(String[] args) {

        // CLIMBING STAIRS ( WAYS TO REACH nth STAIRS WITH 1 OR 2 STAIRS AT A TIME)
        // System.out.println(WaysRec(5));
        // System.out.println(WaysTab(5));
        int n = 5;
        int Ways[] = new int[n + 1];
        Arrays.fill(Ways, -1);
        System.out.println(WaysMemo(n, Ways));
    }
}
