
public class TwoDarray4 {

    // USING STAIR-CASE SEARCH 
    public static boolean Search(int Matrix[][], int key) {
        int row = 0;
        int col = Matrix[0].length - 1;
        while (row < Matrix.length && col >= 0) {
            if (Matrix[row][col] == key) {
                System.out.println("KEY FOUND AT: Row = " + row + " And Col = " + col);
                return true;
            } else if (key > Matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        // SEARCH IN SORTED MATRIX ( EVERY ROW AND COLUMN ARE SORTED)
        int Matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int key = 7;
        Search(Matrix, key);

    }
}
