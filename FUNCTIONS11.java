
public class FUNCTIONS11 {

    public static int BtoD(int b) {
        int d = 0;
        int i = 0;
        while (b > 0) {
            int digit = b % 10;
            d += digit * Math.pow(2, i);
            b = b / 10;
            i++;
        }
        return d;
    }

    public static void main(String[] args) {
        // BINARY -> DECIMAL 
        System.out.println(BtoD(10011101));
    }
}
