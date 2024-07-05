
public class SORTING1 {

    public static void BubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {           // N iterations 
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];            // SWAPPING 
                    arr[j + 1] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {

        // BUBBLE SORT 
        int arr[] = {3, 2, 1, 4, 5};
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
