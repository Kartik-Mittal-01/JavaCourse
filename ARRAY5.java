
public class ARRAY5 {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void ReverseArr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // REVERSE A ARRAY 

        int arr[] = {1, 2, 3, 4, 5};
        printArr(arr);
        System.out.println();
        ReverseArr(arr);
        printArr(arr);

    }
}
