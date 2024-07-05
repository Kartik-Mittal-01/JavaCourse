
public class BIT7 {

    public static void GetIth(int n, int i) {

        if ((n & (1 << i)) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {

        // GET ith BIT 
        GetIth(5, 0);
    }
}
