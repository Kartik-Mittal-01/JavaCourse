
public class Question26 {

    public static boolean CheckRepeat(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
        Given an integer array nums, return true if any value appears at least twice in the 
        array, and return false if every element is distinct
        
         */

        int arr[] = {1, 2, 3, 4, 4, 1};
        System.out.println("Duplicate of any number is present? " + CheckRepeat(arr));

    }
}
