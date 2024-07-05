
public class BIT10 {

    public static int UpdateIth(int n, int i, int newbit) {
        if (newbit == 0) {
            return (n & ~(1 << i));
        } else {
            return (n | (i << i));
        }

    }

    public static void main(String[] args) {

        // Update ith BIT (update the ith bit to either 0 or 1)
        System.out.println(UpdateIth(3, 0, 1));  // o/p: 3
        System.out.println(UpdateIth(3, 0, 0));  // o/p: 2

    }
}
