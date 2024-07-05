
public class SEGMENTTREE3 {

    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];

    }

    public static int CreateST(int arr[], int i, int si, int ei) {
        if (si == ei) {
            tree[i] = arr[si];
            return tree[i];
        }
        int mid = (si + ei) / 2;
        CreateST(arr, 2 * i + 1, si, mid);
        CreateST(arr, 2 * i + 2, mid + 1, ei);
        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        return tree[i];
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        // NO OVERLAP 
        if (qj <= si || qi >= sj) {
            return 0;
        }
        // COMPLETE OVERLAP 
        if (qi <= si && qj >= sj) {
            return tree[i];
        } //PARTIAL OVERLAP
        else {

            int mid = (si + sj) / 2;
            return getSumUtil(2 * i + 1, si, mid, qi, qj) + getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
        }
    }

    public static int getSum(int arr[], int qi, int qj) {
        int n = arr.length;
        return getSumUtil(0, 0, n - 1, qi, qj);
    }

    public static void main(String[] args) {

        // SUM QUERY ON A SEGEMENT TREE 
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        init(arr.length);
        CreateST(arr, 0, 0, arr.length - 1);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
        int qi = 2;
        int qj = 5;
        System.out.println("SUM QUERY FROM INDEX 2->5 IS IS :" + getSum(arr, qi, qj));
    }
}
