
import java.util.Arrays;

public class GreedyAlgo5 {

    public static void main(String[] args) {

        // INDIAN COINS  -> MINIMUM COINS TO MAKE THE CHANGE FOR THE VALUE "V"
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 590;
        int noOfCoisn = 0;

        Arrays.sort(coins);
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    amount -= coins[i];
                    noOfCoisn++;
                    System.out.print(coins[i] + " ");
                }
            }
        }
        System.out.println();

        System.out.println("TOTAL MINIMUM COINS REQ FOR EXCHANGE ARE: " + noOfCoisn);

    }
}
