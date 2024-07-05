
public class PATTERN2 {

    public static void main(String[] args) {
        /*               
                            PATTERN 2 
                            * * * * * 
                            * * * *
                            * * *
                            * *
                            *
         */
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
