
public class SEGMENTTREE5 {

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

    public static void main(String[] args) {

        // MAX SUBARRAY TREE 
        // CREATING A MAXIMUM SUBARRAY TREE 
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(4 * n);
        STmax(arr, 0, 0, n - 1);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}
