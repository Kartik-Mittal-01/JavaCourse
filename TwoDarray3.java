
public class TwoDarray3 {

    public static int FindDiagSum(int Matrix[][]) {
        int sum = 0;
        // PRIMARY DIAGONAL
        int i = 0;
        int j = 0;
        while (i < Matrix.length && j < Matrix[0].length) {
            sum += Matrix[i][j];
            i++;
            j++;
        }
        // SECONDARY DIAGONAL
        int p = 0;
        int q = Matrix[0].length - 1;
        while (p < Matrix.length && q >= 0) {
            sum += Matrix[p][q];
            p++;
            q--;

        }
        if (Matrix.length % 2 != 0) {
            return sum - Matrix[Matrix.length / 2][Matrix.length / 2];
        } else {
            return sum;
        }

    }

    public static void main(String[] args) {

        // DIAGONAL SUM ( SUM OF ELEMENTS OF PRIMARY AND SECONDARY DIAGONAL)
        int Matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(FindDiagSum(Matrix));

    }
}
