
public class RECURSION1 {

    public static void PrintDec(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        }
        PrintDec(n - 1);
    }

    public static void PrintAsc(int n) {
        if (n == 0) {
            return;
        }
        PrintAsc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        // PRINT FROM N TO 1 
        PrintDec(10);
        System.out.println();

        // PRINT FROM 1 TO N
        PrintAsc(10);
    }
}
