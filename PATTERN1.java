
public class PATTERN1 {

    public static void main(String args[]) {
        int n = 5;

        // PATTERN 1 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
