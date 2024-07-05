
import java.util.Scanner;

public class BASICS20 {

    public static void main(String[] args) {
        // PASS OR FAIL

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        float marks = sc.nextFloat();
        String check = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("Student is:" + check);
    }
}
