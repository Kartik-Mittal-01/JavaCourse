
public class SEGMENTTREE6 {

    static int tree[];

    public static void init(int n) {
        tree = new int[n];
    }

    public static int STmax(int arr[], int i, int si, int sj) {
        if (si == sj) {
            tree[i] = arr[si];
            return tree[i];
        }
        int mid = (si + sj) / 2;
        STmax(arr, 2 * i + 1, si, mid);
        STmax(arr, 2 * i + 2, mid + 1, sj);
        tree[i] = Math.max(tree[2 * i + 2], tree[2 * i + 1]);
        return tree[i];

    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        //NO OVERLAP
        if (si > qj || sj < qi) {
            return Integer.MIN_VALUE;
        }
        //COMPLETER OVERLAP 
        if (si >= qi && sj <= qj) {
            return tree[i];
        } else {
            int mid = (si + sj) / 2;
            int right = getMaxUtil(2 * i + 2, mid + 1, sj, qi, qj);
            int left = getMaxUtil(2 * i + 1, si, mid, qi, qj);
            return Math.max(left, right);
        }

    }

    public static int Getmax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    public static void main(String[] args) {

        // MAX SUBARRAY TREE 
        // QUERY -> RETURNS THE MAXIMUM ELEMENT FOR ANY SUBARRAY (qi - qj)
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(4 * n);
        STmax(arr, 0, 0, n - 1);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
        System.out.println("THE MAXIMUM VALUE BETWEEN INDEX 2 AND 5 IS: " + Getmax(arr, 2, 5));
    }
}
