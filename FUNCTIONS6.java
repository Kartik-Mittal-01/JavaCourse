
public class FUNCTIONS6 {

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // FUNCTION OVERLOADING AS NUMBER OF PARAMETER
        System.out.println(Sum(3, 5));
        System.out.println(Sum(5, 4, 64));

    }
}
