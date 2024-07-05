
public class FUNCTIONS8 {

    public static boolean is_prime(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // PRIME OR NOT 

        System.out.println(is_prime(2));

    }
}
