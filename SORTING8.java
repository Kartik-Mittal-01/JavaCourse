
public class SORTING8 {

    public static int SearchRnS(int arr[], int target, int si, int ei) {

        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {  // CONDITION THAT MID IS PRESENT ON THE LINE 1 
            if (arr[si] <= target && target < arr[mid]) {
                return SearchRnS(arr, target, si, mid - 1);
            } else {
                return SearchRnS(arr, target, mid + 1, ei);
            }
        } else {
            // MID ON THE LINE 2 
            if (arr[mid] < target && target <= arr[ei]) {
                return SearchRnS(arr, target, mid + 1, ei);
            } else {
                return SearchRnS(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {

        // SEARCH IN A ROTATED AND SORTED ARRAY LIST 
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        System.out.println("TARGET " + target + " IS FOUND AT INDEX: " + SearchRnS(arr, target, 0, arr.length - 1));

    }
}
