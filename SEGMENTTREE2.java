
public class SEGMENTTREE2 {

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

    public static void main(String[] args) {

        // CREATION OF A SEGEMENT TREE 
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        init(arr.length);
        CreateST(arr, 0, 0, arr.length - 1);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}
