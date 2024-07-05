
import java.util.ArrayList;
import java.util.Collections;

public class GRAPH18 {

    // CREATE A GRAPH WITH ARRAYLIST THAT STORES THE EDGES 
    static class Edge implements Comparable<Edge> {

        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;
        }
    }

    static void CreateGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    // CODE OF UNION-FIND DATA STRUCTURE 
    static int n = 4;                     // "n" IS THE TOTAL NUMBER OF VERTEX IN THE GRAPH 
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

    static int KRUSKAL(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges); // edge will get sorted on the basis of their Weight 
        int finalcost = 0;
        int count = 0;           // count the number of edges which are present in the MST 

        for (int i = 0; count < V - 1; i++) {   // V-1 edges will be there for V vertex-MST 
            Edge e = edges.get(i);
            int parA = Find(e.src);
            int parB = Find(e.dest);
            if (parA != parB) {
                Union(e.src, e.dest);
                finalcost += e.wt;
                count++;
            }
        }
        return finalcost;

    }

    public static void main(String[] args) {

        // KRUSKAL ALGORITHM ( FOR FINDING THE MINIMUM SPANNING TREE)
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        CreateGraph(edges);
        System.out.println(KRUSKAL(edges, V));
    }
}
