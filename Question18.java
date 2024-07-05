
import java.util.Scanner;

public class Question18 {

    public static void main(String args[]) {
        // Write a program to find the factorial of any number entered by the user
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER TO FIND THE FACTORIAL: ");
        int number = sc.nextInt();
        if (number == 0) {
            int ans = 0;
            System.out.println("THE FACTORIAL IS: " + ans);
        } else {
            int fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("THE FACTORIAL IS:" + fact);

        }

    }
}
