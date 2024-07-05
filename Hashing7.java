
import java.util.HashSet;
import java.util.Iterator;

public class Hashing7 {

    public static void main(String[] args) {

        // HASH SETS 
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set.contains(1));
        set.remove(1);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();

        System.out.println(set);

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(null);  // null can be added to Hash-Sets

        // ITERATIONS ON HASH SETS (METHOD 1)
        for (Integer number : set) {
            System.out.print(number + " ");
        }

        // ITERATIONS ON HASH SETS (METHOD 2)
        System.out.println();

        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

    }
}
