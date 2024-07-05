
import java.util.Scanner;

public class LOOPS6 {

    public static void main(String[] args) {
        // KEEP ENTERING THE NUMBER TILL THE USER ENTERS THE MULTIPLE OF 10 

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int number = sc.nextInt();
        while (true) {
            if (number % 10 == 0) {
                System.out.println("OUT OF LOOP");
                break;
            }
            System.out.print("ENTER THE NUMBER: ");
            number = sc.nextInt();

        }

    }
}
