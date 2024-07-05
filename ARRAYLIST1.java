
import java.util.ArrayList;

public class ARRAYLIST1 {

    public static void main(String[] args) {

        // DYNAMIC SIZE , STORES OBJECTS ("INTEGER" IS STORED INSTEAD OF "int")
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);                                         // O(1)

        System.out.println("ELEMENT AT INDEX 1 IS: " + list.get(1));       // O(1)

        list.remove(2);                                                   // REMOVE THE ELEMENT AT INDEX 2  O(n)
        System.out.println(list);

        list.set(0, -1);                                                  // CHANGE THE ELEMENT AT INDEX 0 TO -1 O(n)
        System.out.println(list);

        System.out.println(list.contains(4));                              // DO 4 EXISTS IN THE LIST ? O(n)

        System.out.println("THE SIZE OF THE LIST IS : " + list.size());

    }
}
