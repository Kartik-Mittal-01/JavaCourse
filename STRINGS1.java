
import java.util.Scanner;

public class STRINGS1 {

    public static void main(String[] args) {

        // STRING DECALRATION METHOD 
        //METHOD-1
        String str = "kartik";

        // METHOD-2
        // String name = new String("kartik")
        // STRING LENGTH 
        System.out.println("THE LENGTH OF THE STRING IS: " + str.length());

        // INPUT A STRING 
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT THE STRING: ");
        String input = sc.nextLine();
        System.out.println("THE STRING U HAD ENTERED IS: " + input);

        // CHAR AT
        System.out.println("THE CHARACTER AT INDEX 0 IS: " + str.charAt(0));

    }
}
