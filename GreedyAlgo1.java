
import java.util.*;

public class GreedyAlgo1 {

    public static void main(String[] args) {

        // ACTIVITY SELECTION 
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};           // end should be sorted in ascending order

        // Sorting start and end acc to such that end become sorted in inc order
        int act[][] = new int[start.length][3];

        for (int i = 0; i < act.length; i++) {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        // lambda func to sort 2D array 
        Arrays.sort(act, Comparator.comparingDouble(O -> O[2]));   // HERE, 2 represents that the sorting should be done on the basis of column 2 (end)

        int activities = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(act[0][0]);

        int lastEnd = act[0][2];

        for (int i = 1; i < act.length; i++) {
            if (act[i][1] >= lastEnd) {
                lastEnd = act[i][2];
                activities++;
                ans.add(i);

            }
        }

        // int activities = 1;
        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(0);
        // int lastEnd = end[0];
        // for (int i = 1; i < end.length; i++) {             // this code is when end list is already sorted in des order 
        //     if (start[i] >= lastEnd) {                     //                    ( NOT IN GENEREAL)
        //         lastEnd = end[i];
        //         activities++;
        //         ans.add(i);
        //     }
        // }
        // answer 
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i));
        }

        System.out.println("MAXIMUM ACTIVITES: " + activities);

    }
}
