
public class PATTERN6 {

    public static void HalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j >= (n - (i - 1))) {
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
                                PATTERN 6 
                                    *
                                   **
                                  ***
                                 ****
                                *****

         */
        HalfPyramid(5);
    }
}
