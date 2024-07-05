
public class PATTERN11 {

    public static void SolidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {

                if (j <= ((2 * n - 1) - (i - 1)) && j >= (n - (i - 1))) {
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
                         PATTERN 11 (SOLID RHOMBUS)
                                  *****
                                 *****
                                *****
                               *****
                              *****
         */

        SolidRhombus(5);
    }
}
