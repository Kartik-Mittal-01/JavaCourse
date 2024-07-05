
import java.util.Scanner;

public class BASICS17 {

    public static void main(String[] args) {
        //INCOME TAX CALCULATOR--

        System.out.println("ENTER THE INCOME-");

        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        //CHECK

        if (income < 500000) {
            int tax1 = 0;
            System.out.println("you need to pay 0% Tax: " + tax1);
        } else if (income >= 500000 && income < 1000000) {
            float tax2 = income * 0.2f;
            System.out.println("you need to pay 20% Tax: " + tax2);
        } else {
            float tax3 = income * 0.3f;
            System.out.println("you need to pay 30% Tax: " + tax3);

        }

    }
}
