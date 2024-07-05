
public class RECURSION3 {

    public static int sum(int n) {

        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        // SUM OF N NATURAL NUMBER !
        int n = 5;
        System.out.println("SUM OF FIRST 5 NATURAL NUMBER IS: " + sum(n));

    }
}
