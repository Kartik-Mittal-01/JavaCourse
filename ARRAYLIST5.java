
import java.util.ArrayList;
import java.util.Collections;

public class ARRAYLIST5 {

    public static void main(String[] args) {

        // SWAP THE ELEMENTS AT THE idx1 AND idx2
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // SORITNG IN ASCENDING ORDER 
        Collections.sort(list);
        System.out.println(list);

        // SORTING IN DESCENDING ORDER 
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
