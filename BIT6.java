
public class BIT6 {

    public static void OddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void main(String[] args) {

        // CHECK IF THE NUMBER IS ODD OR EVEN 
        // LSB OF BINARY OF ODD NUMBER IS 1 
        // LSB OF BINARY OF EVEN NUMBER IS 0
        OddorEven(4);
        OddorEven(5);

    }
}
