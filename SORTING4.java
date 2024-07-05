
import java.util.Arrays;
import java.util.Collections;

public class SORTING4 {

    public static void main(String[] args) {

        // INBUILT SORT 
        int arr[] = {3, 2, 1, 4, 5};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // TO SORT A SUBARRAY IN A ARRAY 
        int arr1[] = {3, 2, 1, 4, 5};
        Arrays.sort(arr1, 2, 5);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        // INBUILT SORT TO SORT IN REVERSE ORDER 
        Integer arr3[] = {3, 2, 1, 4, 5};
        Arrays.sort(arr3, Collections.reverseOrder());

        // for (int i = 0; i < arr3.length; i++) {
        //     System.out.print(arr3[i] + " ");
        // }
        // System.out.println();
        // TO SORT A SUBARRAY IN A ARRAY IN REVERSE ORDER 
        Integer arr4[] = {3, 2, 1, 4, 5};
        Arrays.sort(arr4, 2, 5, Collections.reverseOrder());

        // for (int i = 0; i < arr4.length; i++) {
        //     System.out.print(arr4[i] + " ");
        // }
    }
}
