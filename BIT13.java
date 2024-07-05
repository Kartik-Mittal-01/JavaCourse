
public class BIT13 {

    public static boolean CheckPower(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        // CHECK IF A NUMBER IS OF POWER 2 OR NOT ??
        // REALISE THAT : IF n IS SOME POWER OF 2 THAN ( n & (n-1) ) is equal to 0 !
        System.out.println(CheckPower(4));
        System.out.println(CheckPower(16));
        System.out.println(CheckPower(5));

    }
}
