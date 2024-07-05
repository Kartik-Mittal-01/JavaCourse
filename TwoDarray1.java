
import java.util.Scanner;

public class TwoDarray1 {

    public static void main(String[] args) {

        // CREATION OF A 2D ARRAY 
        int Matrix[][] = new int[3][3];
        int n = Matrix.length;                      // ROWS 
        int m = Matrix[0].length;                   // COLUMNS 
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("ENTER ENTRY FOR ROW NUMBER:" + i + " AND COLUMN NUMBER: " + j + " ->");
                Matrix[i][j] = sc.nextInt();
            }
        }

        // PRINTING THE MATRIX 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
