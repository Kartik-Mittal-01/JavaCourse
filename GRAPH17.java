
public class GRAPH17 {

    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;                    // INITIALLY PARENT OF EVERY ELEMENT IS THE ELEMENT ITSELF 
        }
    }

    public static int Find(int x) {
        if (par[x] == x) {
            return x;
        }
        return Find(par[x]);              // WE CAN USE PATH COMPRESSION HERE => par[x] =Find(par[x])
    }

    public static void Union(int a, int b) {
        int parA = Find(a);
        int parB = Find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void main(String[] args) {

        // DISJOINT SET DATA STRUCTURE ( UNION-FIND DS)
        init();
        Union(1, 3);
        System.out.println("PARENT OF 3 IS: " + Find(3));
        Union(2, 4);
        Union(3, 6);
        Union(1, 4);
        System.out.println("PARENT OF 3 IS: " + Find(3));
        System.out.println("PARENT OF 4 IS: " + Find(4));
        Union(1, 5);

    }
}
