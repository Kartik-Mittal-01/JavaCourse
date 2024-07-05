
import java.util.Arrays;

public class GreedyAlgo7 {

    public static void main(String[] args) {

        // CHOCOLA PROBLEM 
        Integer CV[] = {2, 1, 3, 1, 4};   // This is for a (4 x 6)  chocolate 
        Integer CH[] = {4, 1, 2};
        Arrays.sort(CV);
        Arrays.sort(CH); // sorted in asc order but we need desc order for the max cost cut to get first chance to reduce the cost of cutting 

        int cost = 0;

        int H = CH.length - 1;
        int V = CV.length - 1;
        int hp = 1;
        int vp = 1;
        while (H >= 0 && V >= 0) {                          // I WILL DO A HORIZONTAL CUT 
            if (CH[H] >= CV[V]) {
                cost += CH[H] * vp;
                hp++;
                H--;

            } else {
                cost += CV[V] * hp;                           // I WILL DO A VERTICAL CUT 
                vp++;
                V--;

            }
        }
        while (H >= 0) {
            cost += CH[H] * vp;
            hp++;
            H--;
        }

        while (V >= 0) {
            cost += CV[V] * hp;
            vp++;
            V--;

        }

        System.out.println("total cost is: " + cost);

    }
}
