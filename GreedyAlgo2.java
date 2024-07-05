
import java.util.*;

public class GreedyAlgo2 {

    public static void main(String[] args) {
        //  FRACTIONAL KNAPSACK 

        int values[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ration[][] = new double[values.length][2];
        for (int i = 0; i < ration.length; i++) {
            ration[i][0] = i;
            ration[i][1] = (double) (values[i]) / weight[i];
        }
        Arrays.sort(ration, Comparator.comparingDouble(o -> o[1]));
        int value = 0;
        int finalcap = W;

        for (int i = ration.length - 1; i >= 0; i--) {

            int idx = (int) ration[i][0];
            if (weight[idx] <= finalcap) {
                value += values[idx];
                finalcap -= weight[idx];
            } else {
                value += (ration[i][1] * finalcap);
                // finalcap=0;
                break;
            }
        }

        System.out.println(value);

    }
}
