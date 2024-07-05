
import java.util.Scanner;

public class LOOPS3 {

    public static void main(String[] args) {
        // SUM OF N NATURAL NUMBER 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N to print sum of 1->N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("THE SUM FROM 1->N IS: " + sum);

    }
}
