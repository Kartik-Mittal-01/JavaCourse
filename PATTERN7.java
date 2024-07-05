
public class PATTERN7 {

    public static void NumberHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= (n - (i - 1)); j++) {
                System.out.print(num + " ");
                num++;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberHalfPyramid(5);
        /*
                                PATTERN 7 
                                1 2 3 4 5 
                                1 2 3 4
                                1 2 3
                                1 2
                                1
         */

    }

}
