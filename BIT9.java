
public class BIT9 {

    public static int ClearIth(int n, int i) {
        return n & ~(1 << i);

    }

    public static void main(String[] args) {

        // Clear ith BIT (to 0)
        System.out.println(ClearIth(3, 0));  // --> changes the "1" at index 0 to "0" due to which binary changes from "11"(which is 3) -> "10"(which is 2)

    }
}
