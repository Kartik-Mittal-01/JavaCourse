
public class RECURSION7 {

    public static int FindLastOcc(int arr[], int key, int i) {
        if (arr[i] == key) {
            return i;
        }
        if (i == 0) {
            return -1;
        }
        return FindLastOcc(arr, key, i - 1);

    }

    public static void main(String[] args) {

        // FIND THE FIRST OCCURANCE OF A ELEMENT IN A ARRAY 
        int arr[] = {1, 2, 3, 4, 3, 2, 5};
        int key = 7;
        System.out.println("KEY FIRST FOUND AT INDEX: " + FindLastOcc(arr, key, arr.length - 1));

    }
}
