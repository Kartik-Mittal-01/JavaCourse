
import java.util.Arrays;

public class GreedyAlgo3 {

    public static void main(String[] args) {
        // SUM OF MIN ABSO PAIR DIFF!

        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};  ///---> (1,1) , (2,2), (3,3) => |1-1|+|2-2|+|3-3| = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int diff = 0;
        for (int i = 0; i < A.length; i++) {
            diff += Math.abs(A[i] - B[i]);
        }

        System.out.println(diff);

    }
}
