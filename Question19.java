
import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {
        //Write a program to print the multiplication table of a number N, entered by the user

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER TO PRINT ITS TABLE: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.print(n);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.print(n * i);
            System.out.println();
        }
    }
}
