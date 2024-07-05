
import java.util.ArrayList;

public class ARRAYLIST2 {

    public static void PrintRev(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");

        }
    }

    public static void main(String[] args) {

        // PRINT THE REVERSE OF A ARRAY LIST 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        PrintRev(list);

    }
}
