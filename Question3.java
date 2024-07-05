
import java.util.Scanner;

public class Question3 {

    public static void main(String args[]) {
        /*
         Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        an eraser. You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pencil cost-");
        float pencil = sc.nextFloat();
        System.out.println("Enter the pen cost-");
        float pen = sc.nextFloat();
        System.out.println("Enter the eraser cost-");
        float eraser = sc.nextFloat();
        float total = pencil + eraser + pen;
        float add_on_GST = (total * 0.18f);
        float final_total = total + add_on_GST;
        System.out.println("Total cost without GST:" + total + "$");
        System.out.println("Total GST(18% Charge): " + add_on_GST + "$");
        System.out.println("Final Bill Cost: " + final_total + "$");

    }
}
