
public class PATTERN10 {

    public static void Butterfly(int n) {
        int m = n / 2;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i || j >= n - (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= (m - (i - 1)) || j >= (m + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        /*
                        PATTERN 10 (BUTTERFLY PATTERN)
                                    *      *
                                    **    **
                                    ***  ***
                                    ********
                                    ********
                                    ***  ***
                                    **    **
                                    *      *
         */
        Butterfly(8);
    }
}
