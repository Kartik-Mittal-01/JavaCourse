
import java.util.HashMap;
import java.util.Set;

public class Hashing5 {

    public static void main(String[] args) {

        // MAJORITY ELEMENT ( GET ALL THE ELEMENT THAT APPEAR MORE THAN n/3 TIMES)
        int arr[] = {1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6};

        HashMap<Integer, Integer> map = new HashMap<>();  // key , freq of key 
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);

            }
        }

        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            if (map.get(k) > arr.length / 3) {
                System.out.print(k + " ");
            }
        }

    }
}
