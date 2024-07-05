
import java.util.Scanner;

public class LOOPS7 {

    public static void main(String args[]) {
        // DISPLAY ALL THE NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("ENTER THE NUMBER: ");
            int number = sc.nextInt();

            if (number % 10 != 0) {
                System.out.println(number);
            }
        }

    }

}
