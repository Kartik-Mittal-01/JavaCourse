
public class SORTING3 {

    public static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {

            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // INSERTING AT THE CORRECT INDEX IN THE SORTED LIST
            arr[prev + 1] = curr;

        }
    }

    public static void main(String[] args) {

        // INSERTION SORT 
        int arr[] = {3, 2, 1, 4, 5};
        InsertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
