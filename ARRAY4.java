
public class ARRAY4 {

    public static int BinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;                          // WORKS ONLY FOR SORTED ARRAYS !!!
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // BINARY SEARCH 
        int arr[] = {1, 2, 3, 65, 90, 100};
        System.out.println("TARGET FOUND AT: " + BinarySearch(arr, 100));
    }
}
