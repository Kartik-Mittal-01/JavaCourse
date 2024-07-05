
public class PATTERN15 {

    public static void NumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (j <= (n + (i - 1)) && j >= (n - (i - 1))) {

                    if (j <= n) {
                        System.out.print(((n + 1) - (j)) + " ");
                    } else {
                        System.out.print(((j + 1) - n) + " ");
                    }

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        /*
                                          PATTERN 15 
                                              1
                                            2 1 2
                                          3 2 1 2 3
                                        4 3 2 1 2 3 4
                                      5 4 3 2 1 2 3 4 5

         */
        NumberPattern(6);

    }
}
