
public class TwoDarray2 {

    public static void main(String[] args) {

        int Matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // SPIRALCODE OUTPUT 

        /*

           1  2  3 
           4  5  6 
           7  8  9

           o/p : 1 2 3 6 9 8 7 4 5 
        
        
         */
        int startRow = 0;
        int startCol = 0;
        int endRow = Matrix.length - 1;
        int endCol = Matrix[0].length - 1;
        while (startCol <= endCol && startRow <= endRow) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(Matrix[startRow][j] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(Matrix[i][endCol] + " ");
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {                          //  FOR THE CENTRAL ELEMENT IF TOP IS PRINTED NO NEED TO PRINT BOTTOM 
                    return;
                }
                System.out.print(Matrix[endRow][j] + " ");
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {                           // FOR THE CENTRAL ELEMENT IF LEFT IS PRINTED NO NEED TO PRINT RIGHT 
                    return;
                }
                System.out.print(Matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }

    }
}
