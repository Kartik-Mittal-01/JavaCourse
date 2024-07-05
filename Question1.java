
import java.util.Scanner;

public class Question1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the Third number");
        int c = sc.nextInt();

        float avg = (float) (a + b + c) / 3;
        System.out.println("The avg is: " + avg);

    }
}
