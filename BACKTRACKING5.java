
public class BACKTRACKING5 {

    // GRID WAYS ( NUMBER OF PATHS TO REACH FROM (0,0) T0 (n-1,m-1) OF A nxm MATRIX)
    public static int countWays(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i == n || j == n) {
            return 0;
        }
        int ways1 = countWays(i + 1, j, n, m);
        int ways2 = countWays(i, j + 1, n, m);
        return (ways1 + ways2);
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 3;
        System.out.println(countWays(0, 0, n, m));

    }
}
