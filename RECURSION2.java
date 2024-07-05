
public class RECURSION2 {

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {

        // PRINT FACTORIAL OF A NUMBER N 
        int n = 5;
        System.out.println("FACTORIAL OF 5 IS: " + fact(n));
    }
}
