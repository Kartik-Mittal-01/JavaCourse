
public class BIT8 {

    public static int SetIth(int n, int i) {
        return n | (1 << i);

    }

    public static void main(String[] args) {

        // SET ith BIT (to 1)
        System.out.println(SetIth(2, 0));  // --> changes the "0" at index 0 to 1 due to which binary changes from "10"(which is 2) -> "11"(which is 3)

    }
}
