
import java.util.ArrayList;

public class GRAPH22 {

    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;

        }

    }

    static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], int time, boolean vis[], boolean ap[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if (par == neigh) {
                continue;
            } else if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else {
                dfs(graph, neigh, curr, dt, low, time, vis, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                // ARTICULATION POINT CONDITIONS CHECK 
                if (par != -1 && dt[curr] <= low[neigh]) {
                    // System.out.println("ARTICULATION POINT: " + curr);
                    ap[curr] = true;
                }
                children++;
            }
        }
        // ARTICULATION POINT CONDITIONS CHECK 

        if (par == -1 && children > 1) {
            // System.out.println("ARTICULATION POINT: " + curr);
            ap[curr] = true;

        }

    }

    static void getAP(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];  // THIS PREVENT TO PRINT THE SAME ARTICUALTION POINT MULTIPLE TIMES 
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, time, vis, ap);
            }
        }

        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.println("AP is: " + i);
            }
        }
    }

    public static void main(String[] args) {

        // ARTICULATION POINT 
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        getAP(graph, V);

    }
}
