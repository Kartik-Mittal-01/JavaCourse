
import java.util.Scanner;

public class BASICS18 {

    public static void main(String[] args) {
        //LARGEST OF 3 NUMBERS
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("ERROR! Enter differnt numbers!");
            return;
        }
        if (a > b && a > c) {
            System.out.println("Greatest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Greatest number is: " + b);
        } else {
            System.out.println("Greatest number is: " + c);
        }

    }
}
