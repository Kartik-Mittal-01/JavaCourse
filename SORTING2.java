
public class SORTING2 {

    public static void SelectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int MinPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[MinPos] > arr[j]) {
                    MinPos = j;
                }
            }
            // swap Minpos and i
            int temp = arr[i];
            arr[i] = arr[MinPos];
            arr[MinPos] = temp;
        }
    }

    public static void main(String[] args) {

        // SELECTION SORT ( PICK THE SMALLEST FROM THE UNSORTED AND PUT IT AT THE BEGINNING )
        int arr[] = {3, 2, 1, 4, 5};
        SelectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
