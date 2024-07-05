
import java.util.HashSet;

public class Hashing11 {

    public static void main(String[] args) {

        // UNION AND INTERSECTION OF 2 ARRAYS
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        System.out.println("SET1 IS: " + set1);
        System.out.println("SET2 IS : " + set2);

        // UNION (7,3,9,2,4,6)
        HashSet<Integer> Uset = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            Uset.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            Uset.add(arr2[j]);
        }
        System.out.println("THE UNION OF BOTH ARRAYS IS: " + Uset.size());
        System.out.println("UNION SET: " + Uset);

        //INTERSECTION
        HashSet<Integer> Iset = new HashSet<>();
        for (Integer entry : set1) {
            if (set2.contains(entry)) {
                Iset.add(entry);

            }
        }
        System.out.println("THE INTERSECTION OF BOTH ARRAYS IS: " + Iset.size());
        System.out.println("UNION SET: " + Iset);
    }

}
