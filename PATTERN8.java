
public class PATTERN8 {

    public static void FloydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
                                 PATTERN 8 (FLOYD'S TRAINGLE) 
                                            1 
                                            2 3
                                            4 5 6
                                            7 8 9 10
         */
        FloydTriangle(4);
    }
}
