
import java.util.Scanner;

public class LOOPS8 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int num = sc.nextInt();

        if (num < 0 || num == 0 || num == 1) {
            System.out.println("NOT A PRIME NUMBER!");
        }

        if (num > 1) {
            boolean is_prime = true;
            // METHOD 1 -------------------->
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    is_prime = false;
                }
            }
            System.out.println("PRIME OR NOT: " + is_prime);

            // METHOD 2 ----------------------->
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    is_prime = false;
                }
            }
            System.out.println("PRIME OR NOT: " + is_prime);

        }

    }
}
