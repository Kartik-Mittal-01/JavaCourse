
import java.util.ArrayList;

public class ARRAYLIST8 {
    // O(n^2)

    public static boolean PairExist(ArrayList<Integer> list, int targetSum) {

        // BRUTE FORCE APPROACH 
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetSum) {
                    System.out.println("PAIR EXISTS!");
                    return true;
                }
            }
        }
        return false;
    }

    // O(n)
    public static boolean Pair(ArrayList<Integer> list, int targetSum) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            int currSum = list.get(lp) + list.get(rp);
            if (currSum == targetSum) {
                return true;
            }
            if (currSum > targetSum) {
                rp--;
            } else {
                lp++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // PAIR SUM ( FIND IF ANY PAIR IN A SORTED ARRAY LIST HAS A TARGET SUM)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        PairExist(list, 5);
        System.out.println("EXIST ? : " + Pair(list, 5));
        System.out.println("EXIST ? : " + Pair(list, 15));

    }
}
