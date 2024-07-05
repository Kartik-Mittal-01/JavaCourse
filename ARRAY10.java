
public class ARRAY10 {

    public static int Kadane(int arr[]) {
        int sum = 0;
        int max_Sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max_Sum) {
                max_Sum = sum;
            }

        }
        return max_Sum;

    }

    public static void main(String[] args) {

        // MAX SUBARR SUM USING KADANE'S ALGO
        int arr[] = {-1, -2, -3, 4, -5};
        System.out.println("MAX SUBARR SUM: " + Kadane(arr));

    }
}
