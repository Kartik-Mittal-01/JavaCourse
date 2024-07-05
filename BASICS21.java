
import java.util.Scanner;

public class BASICS21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Button number: ");
        int button = sc.nextInt();

        // String result = switch (button) {
        //     case 1 -> "u had clicked button 1!";             // do not give default case at every case 
        //     case 2 -> "u had clicked button 2!";
        //     default -> "none of the case matches";
        // };
        // System.out.println(result);
        switch (button) {
            case 1:
                System.out.println("u had clicked button 1!");
            case 2:
                System.out.println("u had clicked button 2!");        // gives default case at every case 
            default:
                System.out.println("none of the case matches");
        }

    }
}
