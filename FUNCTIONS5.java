
public class FUNCTIONS5 {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int binoCoeff(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));

    }

    public static void main(String[] args) {

        System.out.println(fact(0));

        System.out.println(binoCoeff(5, 0));

    }
}
