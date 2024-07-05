
import java.util.*;

public class LOOPS5 {

    public static void main(String args[]) {
        // REVERSE A NUMBER
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO GET THE REVERSED NUMBER: ");
        int number = sc.nextInt();
        int rev = 0;

        while (number > 0) {
            rev = rev * 10 + (number % 10);

            number = number / 10;

        }
        System.out.println("REVERSED NUMBER IS: " + rev);

    }
}
