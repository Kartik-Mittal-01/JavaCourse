
import java.util.Scanner;

public class ARRAY1 {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        //ARRAYS
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE LENGTH OF YOUR ARRAY: ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the entry " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }
        System.out.println("YOUR ARRAY IS:");
        System.out.print("{ ");
        printArr(marks);
        System.out.print(" }");

    }
}
