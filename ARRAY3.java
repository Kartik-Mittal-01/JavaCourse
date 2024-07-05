
public class ARRAY3 {

    public static int FindMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {

        // LARGEST NUMBER IN A ARRAY
        int arr[] = {-1, -2, -3, -4, -5};
        System.out.println("MAXIMUM IN THE ARRAY IS: " + FindMax(arr));

    }
}
