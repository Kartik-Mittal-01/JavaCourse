
import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {
        /*
        Finish the following code so that it prints You have a fever if your temperature
        is above 100 and otherwise prints You don't have a fever.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your temperature in Fareheit:");
        double temperature = sc.nextDouble();

        if (temperature > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You do not have a fever");
        }

    }
}
