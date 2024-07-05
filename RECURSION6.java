
public class RECURSION6 {

    public static int FindFirstOcc(int arr[], int key, int i) {
        if (arr[i] == key) {
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }
        return FindFirstOcc(arr, key, i + 1);

    }

    public static void main(String[] args) {

        // FIND THE FIRST OCCURANCE OF A ELEMENT IN A ARRAY 
        int arr[] = {1, 2, 3, 4, 3, 2, 5};
        int key = 7;
        System.out.println("KEY FIRST FOUND AT INDEX: " + FindFirstOcc(arr, key, 0));

    }
}
