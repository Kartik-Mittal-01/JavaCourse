
import java.util.Scanner;

public class BASICS22 {

    public static void main(String[] args) {
        //CALCULATOR 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number-");
        int a = sc.nextInt();
        System.out.println("Enter the second number-");
        int b = sc.nextInt();
        System.out.println("Enter the operator(+,-,*,/,%)");
        char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+':
        //         System.out.println("The sum of two number is: "+(a+b));
        //     case '-':
        //         System.out.println("The Difference of two number is: "+(a-b));
        //     case '*':
        //         System.out.println("The Multiplication of two number is: "+(a*b));
        //     case '/':
        //         System.out.println("The divison of two number is: "+(a/b));
        //     case '%':
        //         System.out.println("The remainder of two number is: "+(a%b));
        //     default:
        //         throw new AssertionError("INVALID OPERATOR");
        // }
        String result = switch (operator) {
            case '+':
                yield "The sum of two numbers is: " + (a + b);
            case '-':
                yield "The difference of two numbers is: " + (a - b);
            case '*':
                yield "The multiplication of two numbers is: " + (a * b);
            case '/':
                yield "The division of two numbers is: " + (a / b);
            case '%':
                yield "The remainder of two numbers is: " + (a % b);
            default:
                yield "Invalid operator!";
        };
        System.out.println(result);

    }
}
