
public class PATTERN12 {

    public static void HollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {

                if ((i == 1 && j <= ((2 * n - 1) - (i - 1)) && j >= (n - (i - 1))) || (i == n && j <= ((2 * n - 1) - (i - 1)) && j >= (n - (i - 1)))) {
                    System.out.print("*");
                } else if (j == ((2 * n - 1) - (i - 1)) || j == (n - (i - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
                        PATTERN 12 (HOLLOW RHOMBUS)
                                *****
                               *   * 
                              *   *  
                             *   *   
                            *****
         */

        HollowRhombus(5);
    }
}
