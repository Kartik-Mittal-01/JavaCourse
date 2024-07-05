
public class PATTERN9 {

    public static void BinaryPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        /*
                                  PATTERN 9 
                                    1 
                                    0 1
                                    1 0 1
                                    0 1 0 1
                                    1 0 1 0 1
         */
        BinaryPattern(5);
    }
}
