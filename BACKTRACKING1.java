
public class BACKTRACKING1 {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void ChangeArr(int arr[], int i, int val) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = val;
        ChangeArr(arr, i + 1, val + 1);    // RECURSION 
        arr[i] = arr[i] - 2;            // BACKTRACK 
    }

    public static void main(String[] args) {

        // FILL A EMPTY ARRAY 1 2 3 4 5 (DURING RECURSION) AND THEN DEC THEN VALUE OF EACH ELEMENT BY 2 (DURING BACKTRACK)
        int arr[] = new int[5];
        ChangeArr(arr, 0, 1);
        System.out.println();
        printArr(arr);
    }
}
