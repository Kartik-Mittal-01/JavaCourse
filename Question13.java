
import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {
        /*
        Write a Java program to input week number(1-7) and print day of week name
        using switch case
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE WEEK NUMBER- ");
        int num = sc.nextInt();

        String result = switch (num) {
            case 1 ->
                "Monday";
            case 2 ->
                "Tuesday";
            case 3 ->
                "Wednesday";
            case 4 ->
                "Thursday";
            case 5 ->
                "Friday";
            case 6 ->
                "Saturday";
            case 7 ->
                "Sunday";
            default ->
                throw new IllegalArgumentException("INVALID NUMBER: " + num);
        };
        System.out.print("Day corresponding to week number is: " + result);

    }
}
