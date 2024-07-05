
import java.util.Scanner;

public class BASICS19 {

    public static void main(String[] args) {
        //TERNARY OPERATOR 

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String type = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);

    }
}
