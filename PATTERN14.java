
public class PATTERN14 {

    public static void NumberPyramid(int n) {
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (2 * n - 1); j++) {
                    if (((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) && j <= n + (i - 1) && j >= (n - (i - 1))) {
                        System.out.print(i);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (2 * n - 1); j++) {
                    if (((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) && j <= n + (i - 1) && j >= (n - (i - 1))) {
                        System.out.print(i);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        /*
                           PATTERN 14
                                1    
                               2 2
                              3 3 3
                             4 4 4 4
                            5 5 5 5 5
                           
         */
        NumberPyramid(9);

    }
}
