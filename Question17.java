
import java.util.Scanner;

public class Question17 {

    public static void main(String args[]) {
        /*
        Write a program that reads a set of integers, and then prints the sum of the
        even and odd integers
         */
        Scanner sc = new Scanner(System.in);
        int odd_sum = 0;
        int even_sum = 0;
        int button = 1;
        int number;

        while (button == 1) {

            System.out.print("ENTER THE NUMBER: ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                even_sum += number;
            } else {
                odd_sum += number;
            }
            System.out.println("Enter 1:TO CONTINUE , 0:TO QUIT");
            button = sc.nextInt();
        }
        System.out.println("SUM OF EVEN NUMBERS IS: " + even_sum);
        System.out.println("SUM OF ODD NUMBERS IS: " + odd_sum);

    }
}
