
public class ARRAY8 {

    public static int MaxSubarrSum(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    if (sum > max_sum) {
                        max_sum = sum;
                    }

                }
            }
        }
        return max_sum;

    }

    public static void main(String[] args) {

        // MAX SUBARR SUM - BRUTE FORCE
        int arr[] = {-1, -2, 3, -4, -5};
        System.out.println("THE MAXIMUM SUM OF A SUBARR: " + MaxSubarrSum(arr));

    }
}
