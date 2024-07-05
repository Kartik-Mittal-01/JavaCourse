
public class RECURSION12 {

    public static void PrintBinary(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        PrintBinary(n - 1, 0, str + "0");
        if (lastplace == 0) {
            PrintBinary(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        // PRINT ALL THE BINARY STRINGS OF SIZE N WITHOUT CONSECUTIVE ONES 
        int n = 3;
        PrintBinary(n, 0, "");
    }
}
