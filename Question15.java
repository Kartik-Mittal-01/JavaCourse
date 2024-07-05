
import java.util.Scanner;

public class Question15 {

    public static void main(String args[]) {
        /*
        Write a Java program that takes a year from the user and print whether that
        year is a leap year or not
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE YEAR: ");
        int year = sc.nextInt();

        //check
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }

    }
}
