
import java.util.*;

public class Question11 {

    public static void main(String[] args) {

        /*
         Write a Java program to get a number from the user and print whether it is
        positive or negative
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        float number = sc.nextFloat();
        if (number > 0) {
            System.out.println("+ve");
        } else if (number < 0) {
            System.out.println("-ve");
        } else {
            System.out.println("ENTERED NUMBER IS 0");
        }

    }

}
