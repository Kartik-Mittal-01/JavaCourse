
public class RECURSION8 {

    // METHOD 1
    public static int Findpow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * Findpow(x, n - 1);
    }

    // METHOD 2 (MORE OPTIMISED)
    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return power(x, n - n / 2) * power(x, n / 2);
    }

    public static void main(String[] args) {

        // PRINT x TO THE POWER OF n !
        int x = 5;
        int n = 2;
        System.out.println(Findpow(x, n));
        System.out.println(power(x, n));

    }
}
