
public class BIT14 {

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;   // RIGHT SHIFT THE NUMBER BY 1 AND CHECK WHETHER LSB IS 1 OR 0 
        }
        return count;
    }

    public static void main(String[] args) {

        // FIND THE NUMBER OF 1'S IN THE BINARY REPRESENTATION OF A NUMBER n
        System.out.println(count(16));

    }
}
