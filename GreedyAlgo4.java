
import java.util.*;

public class GreedyAlgo4 {

    public static void main(String[] args) {

        // MAX LENGTH CHAIN OF PAIRS 
        // THIS IS SIMILAR TO ACTIVITY SELECTION SINCE WE NEED TO GET THE MAXIMUM NUMBER OF DISJOINT PAIRS JUST LIKE IN ACTIVITY SELECTION 
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};  //  SORTED ON THE BASIS OF ENDING TIME (ENDING POINT OF PAIR)

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainlength = 1;
        int lastend = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastend) {
                chainlength++;
                lastend = pairs[i][1];

            }
        }

        System.out.println("THE CHAIN LENGTH IS: " + chainlength);

    }
}
