
import java.util.ArrayList;

public class ARRAYLIST4 {

    public static void Swap(ArrayList<Integer> list, int i1, int i2) {
        int temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
    }

    public static void main(String[] args) {

        // SWAP THE ELEMENTS AT THE idx1 AND idx2
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Swap(list, 0, 4);
        System.out.println(list);

    }
}
