
public class Question27 {

    public static int Binarysearch(int arr[], int target, int st, int end) {
        // int st = 0;
        // int end = arr.length;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target > arr[mid]) {
                st = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static int findMinIdx(int arr[]) {
        int right = arr.length - 1;
        int left = 0;
        while (left <= right) {
            int mid = (left) + (right - left) / 2;
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                return mid;
            } else if (arr[left] <= arr[mid] && arr[right] < arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int TargetRotated(int arr[], int target) {

        // finding the index of element "0"
        int k = findMinIdx(arr);
        int n = arr.length;
        if (target >= arr[k] && target <= arr[n - 1]) {
            return Binarysearch(arr, target, k, n - 1);
        } else {
            return Binarysearch(arr, target, 0, k - 1);
        }

    }

    public static void main(String[] args) {

        /*
        There is an integer array nums sorted in ascending order (with distinct values).
        Prior to being passed to your function, nums is possibly rotated at an unknown 
        pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
        nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
        example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and 
        become [4,5,6,7,0,1,2].
        Given the array nums after the possible rotation and an integer target, return the 
        index of target if it is in nums, or -1 if it is not in nums.
        You must write an algorithm with O(log n) runtime complexity.
         */
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.print("TARGET FOUND AT INDEX: " + TargetRotated(arr, target));

    }
}
