
public class BIT12 {

    public static int ClearRange(int n, int i, int j) {

        for (int k = i; k <= j; k++) {
            int bitMask = ~(1 << k);
            n = n & bitMask;
        }
        return n;

    }

    public static int ClearR(int n, int i, int j) {
        return (n & ((~0) << j)) | (n & ~((~0) << i));
    }

    public static void main(String[] args) {

        // Clear ith BIT (to 0)
        System.out.println(ClearRange(10, 2, 4));
        System.out.println(ClearR(10, 2, 4));

    }
}
