
import java.util.ArrayList;

public class ARRAYLIST9 {

    public static boolean TargetSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bi = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bi = i + 1;
                break;
            }
        }
        int start = bi;
        int end = bi - 1;
        while (start != end) {

            if (list.get(start) + list.get(end) == target) {
                return true;
            }
            if (list.get(start) + list.get(end) < target) {
                start = (start + 1) % n;
            } else {
                end = (end + n - 1) % n;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        // PAIR SUM IN A SORTED AND ROTATED ARRAYLIST 

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int targetsum = 50;
        System.out.println(TargetSum(list, targetsum));

    }
}
