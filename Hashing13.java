
import java.util.HashMap;

public class Hashing13 {

    public static void main(String[] args) {

        // LARGEST SUBARRAY WITH SUM 0
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int sum = 0;
        int maxlength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                maxlength = Math.max(maxlength, i - map.get(sum));

            }
        }
        System.out.println("MAXIMUM SUBARRAY LENGTH WHOSE SUM IS ZERO IS: " + maxlength);
    }
}
