
public class ARRAY2 {

    public static int LinearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;

            }
        }
        return -1;
        
    }

    public static void main(String[] args) {

        // LINEAR SEARCH
        int marks[] = {1, 2, 5, 545, 34, 36, 76};
        System.out.print("TARGET FOUND AT INDEX: " + LinearSearch(marks, 36));

    }
}
