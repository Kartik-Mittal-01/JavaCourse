
public class Heaps5 {

    // for sorting in ascending order using max heap ( arr -> min heap -> max heap)
    // for sorting in descending order using min heap ( arr -> min heap)
    // sorting in ascending order using max heap 
    public static void heapify(int arr[], int i, int size) {
        int left = (2 * i + 1);
        int right = (2 * i + 2);
        int minIdx = i;
        if (left < size && arr[minIdx] < arr[left]) {
            minIdx = left;
        }
        if (right < size && arr[minIdx] < arr[right]) {
            minIdx = right;
        }
        if (minIdx != i) {

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            heapify(arr, minIdx, size);

        }
    }

    public static void Heapsort(int arr[]) {
        int n = arr.length;
        // heapify call for non leaf elements convert min heap to max heap 
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }
        // this heapify call convert the arr list to ascending order 
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 3};
        Heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
