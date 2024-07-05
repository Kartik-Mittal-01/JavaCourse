
import java.util.HashMap;

public class Hashing14 {

    public static void main(String[] args) {

        // SUBARRAY SUM = K
        int arr[] = {1, 2, 3};
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();  // stores sum and the frequency of that sum 
        map.put(0, 1);  // this is always added to the map to include the condition when the sum of array is itself k 

        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {  // i got a subarray whose sum is = "k"!
                ans += map.get(sum - k);

            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(ans);
    }
}
