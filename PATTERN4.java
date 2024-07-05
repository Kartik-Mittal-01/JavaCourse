
public class PATTERN4 {

    public static void main(String[] args) {
        /*
                           PATTERN 4      
                            A 
                            B C
                            D E F
                            G H I J
                            K L M N O
         */

        int n = 5;
        char charac = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(charac + " ");
                charac++;
            }
            System.out.println();
        }

    }
}
