
public class RECURSION4 {

    public static int NthFibo(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return NthFibo(n - 1) + NthFibo(n - 2);
    }

    public static void main(String[] args) {

        // Nth FIBONACCI NUMBER 
        System.out.println("5th FIBONACCI NUMBER IS: " + NthFibo(5));
    }
}
