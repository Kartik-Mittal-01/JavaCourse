
public class ARRAY9 {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int MaxSubarrSum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        int max_sum = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < prefix.length; i++) {

            for (int j = 0; j < prefix.length; j++) {
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];

                }
                if (sum > max_sum) {
                    max_sum = sum;
                }

            }
        }
        return max_sum;

    }

    public static void main(String[] args) {
        // MAXSUM SUBARRAY USING PREFIX METHOD
        int arr[] = {1, 2, 3};
        System.out.println("MAXSUM OF A SUBARRAY IS: " + MaxSubarrSum(arr));

    }
}
