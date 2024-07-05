
public class PATTERN5 {

    public static void HollowRect(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HollowRect(5);

        /*
                              PATTERN 5
                                *****
                                *   *
                                *   *
                                *   *
                                *****
         */
    }
}
