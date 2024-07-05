
import java.util.Scanner;

public class LOOPS2 {

    public static void main(String[] args) {
        // PRINT 1 ->  N 
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 'N': ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
