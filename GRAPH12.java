
import java.util.ArrayList;
import java.util.PriorityQueue;

public class GRAPH12 {

    static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;

        }
    }

    // DIJKSTRA'S ALGO ( SHORTEST PATH FROM SRC TO ALL THE VERTEXES)
    static class Pair implements Comparable<Pair> {

        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;     // small path first in pq
        }
    }

    static void DIJKSTRA(ArrayList<Edge> graph[], int src) {
        boolean vis[] = new boolean[graph.length];
        int distance[] = new int[graph.length];                      // STORES THE DISTANCE FROM SRC TO distance[i]
        for (int i = 0; i < distance.length; i++) {
            if (i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (distance[u] + wt < distance[v]) {
                        distance[v] = wt + distance[u];
                        pq.add(new Pair(v, distance[v]));

                    }

                }

            }

        }
        for (int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }

    }

    public static void main(String[] args) {

        // MAKING A GRAPH 
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {                 // AT EVERY INDEX OF GRAPH LIST I HAD CREATED A ARRAYLIST OF EDGE!
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        DIJKSTRA(graph, 0);

    }
}
