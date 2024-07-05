
import java.util.Stack;

public class Stack5 {

    public static void nextgreater(int arr[]) {
        int result[] = new int[arr.length];
        result[arr.length - 1] = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                result[i] = arr[i + 1];
            } // BRUTE FORCE METHOD 
            else {
                result[i] = -1;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void NextGrStack(int arr[]) {
        Stack<Integer> s = new Stack<>();

        int nextgrtr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextgrtr[i] = -1;
            } else {
                nextgrtr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nextgrtr.length; i++) {
            System.out.print(nextgrtr[i] + " ");
        }

    }

    public static void main(String[] args) {
        //NEXT GREATER ELEMENT 

        int arr[] = {6, 8, 0, 1, 3};
        nextgreater(arr);
        System.out.println();
        NextGrStack(arr);

    }
}
