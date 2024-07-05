
public class FUNCTIONS9 {

    public static boolean is_prime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printInRange(int s, int e) {
        for (int i = s; i <= e; i++) {
            if (is_prime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        // PRIMES IN A RANGE
        printInRange(1, 11);

    }
}
