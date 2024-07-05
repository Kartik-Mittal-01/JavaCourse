
public class SORTING5 {

    public static void CountSort(int arr[]) {
        // Finding the length of COUNT array which is equal to (1+ largestElement) where 1 is for "0" element 
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
    }

    public static void main(String[] args) {

        // COUNT SORT 
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        CountSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
