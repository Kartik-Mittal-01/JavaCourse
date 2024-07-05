
import java.util.ArrayList;

public class ARRAYLIST3 {

    public static void PrintMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("MAX ELEMENT OF THE LIST IS: " + max);

    }

    public static void main(String[] args) {

        // PRINT THE MAXUMUM NUMBER OF A ARRAYLIST 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        PrintMax(list);

    }
}
