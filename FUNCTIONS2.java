
public class FUNCTIONS2 {

    public static void SwapNumber(int a, int b) {
        System.out.println("BEFORE SWAP: " + a + "," + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("AFTER SWAP: " + a + "," + b);

    }

    public static void main(String[] args) {
        int x = 34;
        int y = 35;
        SwapNumber(x, y);

    }
}
