
public class ARRAY6 {

    public static void PrintPairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("( " + arr[i] + "," + arr[j] + " )");
                System.out.print(" , ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // PRINT PAIRS OF A ARRAY

        int arr[] = {1, 2, 3, 4, 5};

        PrintPairs(arr);

    }

}
