
public class RECURSION9 {

    public static int CountWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return CountWays(n - 1) + CountWays(n - 2);
    }

    public static void main(String[] args) {

        // TILING PROBLEM 
        System.out.println("NUMBER OF WAYS: " + CountWays(3));

    }
}
