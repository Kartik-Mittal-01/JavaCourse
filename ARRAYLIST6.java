
import java.util.ArrayList;

public class ARRAYLIST6 {

    public static void main(String[] args) {

        // MULTIDIMENSIONAL ARRAYLIST  [[1,2,3] , [-1,-2,-3]]
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(-1);
        list2.add(-2);
        list2.add(-3);

        mainlist.add(list1);
        mainlist.add(list2);

        System.out.println(mainlist);

    }
}
