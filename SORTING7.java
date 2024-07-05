
public class SORTING7 {

    public static int PartitionIndex(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;           // INITIALISING WITH -1
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i = i + 1;
                int temp = arr[j];
                arr[j] = arr[i];     // SWAP THE VALUES AT i and j if the value at j is less than our pivot 
                arr[i] = temp;
            }
        }
        // At last INCREASE THE i BY 1 AND SWAP THE VALUE AT i and PIVOT VALUE 
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i; // PARTITION IDX 
    }

    public static void Quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivot = PartitionIndex(arr, si, ei);
        Quicksort(arr, si, pivot - 1);              // QUICK SORT CALL FOR THE ARRAY ON THE LEFT SIDE OF PIVOT 
        Quicksort(arr, pivot + 1, ei);              // QUICK SORT CALL FOR THE ARRAY ON THE LEFT RIGHT SIDE OF PIVOT 
    }

    public static void main(String[] args) {

        // QUICK SORT ( DIVIDE AND CONQUER [PIVOT AND PARTITION])
        int arr[] = {5, 4, 1, 3, 2};
        Quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
