
import java.util.HashSet;

public class Hashing10 {

    public static void main(String[] args) {

        // COUNT DISTINCT ELEMENTS 
        int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }

        System.out.println("THE NUMBER OF DISTINCT ELEMENTS ARE: " + set.size());
    }
}
