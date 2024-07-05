
public class BIT11 {

    public static int CleariBits(int n, int i) {

        for (int k = 0; k < i; k++) {
            int bitMask = ~(1 << k);
            n = (n & bitMask);
        }
        return n;

    }

    public static int ClearBits(int n, int i) {
        return (n & ((~0) << i));                  // (~0)<<i is (11111111)<<i => 11100000
    }                                              //                                (for i = 5)   

    public static void main(String[] args) {

        // Clear i BITs (to 0)
        System.out.println(CleariBits(3, 0));
        System.out.println(ClearBits(3, 0));

    }
}
