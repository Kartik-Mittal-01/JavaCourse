
public class ARRAY7 {

    public static void PrintSubarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        // PRINT SUBARRAYS
        int arr[] = {1, 2, 3, 4, 5};
        PrintSubarr(arr);
    }
}
