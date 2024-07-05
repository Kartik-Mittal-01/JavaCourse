
public class FUNCTIONS4 {

    public static void fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("THE FACTORIAL IS: " + f);
    }

    public static void main(String[] args) {
        // FUNCTION TO PRINT FACTORIAL OF N 
        fact(5);
    }
}
