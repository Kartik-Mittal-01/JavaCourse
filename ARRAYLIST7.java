
import java.util.ArrayList;

public class ARRAYLIST7 {

    public static void main(String[] args) {

        // GIVEN N LINES ON A X AXIS USE TWO LINE TO FORM A CONTAINER SUCH THAT IT HOLDS THE MAXIMUM WATER
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // BRUTE FORCE (O(n^2))
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i; j < height.size(); j++) {
                maxWater = Math.max(maxWater, (j - i) * Math.min(height.get(i), height.get(j)));
            }
        }
        System.out.println("MAXIMUM WATER THAT CAN BE STORED BETWEEN TWO LINES IS: " + maxWater);

        // TWO POINTER APPROACH (O(n))
        int max = 0;
        int start = 0;
        int end = height.size() - 1;
        while (start < end) {
            max = Math.max(max, (end - start) * Math.min(height.get(start), height.get(end)));
            if (height.get(end) > height.get(start)) {
                start++;
            } else {
                end--;
            }

        }
        System.out.println("MAXIMUM WATER THAT CAN BE STORED BETWEEN TWO LINES IS: " + max);

    }
}
