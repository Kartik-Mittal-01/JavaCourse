
public class ARRAY11 {

    public static int TrapWater(int arr[]) {
        int n = arr.length;
        int LMB[] = new int[n];
        int RMB[] = new int[n];
        LMB[0] = arr[0];
        RMB[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            LMB[i] = Math.max(LMB[i - 1], arr[i]);
        }
        for (int j = n - 2; j >= 0; j--) {
            RMB[j] = Math.max(RMB[j + 1], arr[j]);
        }
        int TrapWater = 0;
        for (int k = 0; k < arr.length; k++) {
            TrapWater += (Math.min(RMB[k], LMB[k]) - arr[k]);
        }

        return TrapWater;

    }

    public static void main(String[] args) {
        // TRAPPING RAIN WATER
        // => Trapped water = sigma( MIN(max left bound , max right bound)- height)
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("AMOUNT OF TRAPPED WATER IS: " + TrapWater(arr));
    }

}
