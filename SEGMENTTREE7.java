
public class SEGMENTTREE7 {

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

    public static void UpdateUtil(int i, int si, int sj, int idx, int newVal) {
        // NO OVERLAP
        if (idx < si || idx > sj) {
            return;
        }
        // ROOT NODE 
        if (si == sj) {
            tree[i] = newVal;
        }
        if (si != sj) {
            tree[i] = Math.max(tree[i], newVal);
            int mid = (si + sj) / 2;
            UpdateUtil(2 * i + 1, si, mid, idx, newVal);
            UpdateUtil(2 * i + 2, mid + 1, sj, idx, newVal);

        }

    }

    public static void Update(int arr[], int idx, int newVal) {
        // UPDATING THE arr[]
        arr[idx] = newVal;
        //UPDATING THE SEGMENT TREE 
        int n = arr.length;
        UpdateUtil(0, 0, n - 1, idx, newVal);
    }

    public static void main(String[] args) {

        // MAX SUBARRAY TREE 
        // UPDATE THE ELEMENT 
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(4 * n);
        STmax(arr, 0, 0, n - 1);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
        Update(arr, 2, 20);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}
