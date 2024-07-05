
public class PATTERN13 {

    public static void Diamond(int n) {
        int m = n / 2;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= (n - 1); j++) {
                if (j >= (m - i) && j <= (m + i)) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= (n - 1); j++) {
                if (j >= i && j <= ((n - 1) - (i - 1))) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        /*
                                      PATTERN 13
                                          *       
                                        * * *
                                      * * * * *
                                    * * * * * * *
                                    * * * * * * *
                                      * * * * *
                                        * * *
                                          *
         */
        Diamond(8);

    }
}
