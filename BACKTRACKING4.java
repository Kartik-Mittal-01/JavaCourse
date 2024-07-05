
public class BACKTRACKING4 {

    public static void printBoard(char board[][]) {
        System.out.println("<------ CHESS BOARD ------>");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(char board[][], int i, int j) {

        // CHECKS WHETHER IT'S SAFE TO PUT QUEEN IN THAT CELL ?
        // VERTICAL UP?
        for (int k = i - 1; k >= 0; k--) {
            if (board[k][j] == 'Q') {
                return false;
            }
        }

        // DIAGONAL LEFT UP?
        for (int p = i - 1, q = j - 1; p >= 0 && q >= 0; p--, q--) {
            if (board[p][q] == 'Q') {
                return false;
            }
        }

        // DIAGONAL RIGHT UP??
        for (int p = i - 1, q = j + 1; p >= 0 && q <= board.length - 1; p--, q++) {
            if (board[p][q] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void QueenWays(char board[][], int i) {
        if (i == board.length) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, i, j)) {
                board[i][j] = 'Q';
                QueenWays(board, i + 1);
                board[i][j] = 'x';
            }
        }
    }

    public static void main(String[] args) {

        // PLACE N QUEENS ON A (N X N) CHESSBOARD SUCH THAT NO 2 QUEENS ATTACK EACH OTHER 
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'x';
            }
        }
        QueenWays(board, 0);

    }
}
