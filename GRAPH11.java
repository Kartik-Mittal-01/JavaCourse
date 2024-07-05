
import java.util.ArrayList;

public class GRAPH11 {

    static class Edge {

        // int src;
        int dest;
        // int wt;

        public Edge(int src, int dest, int wt) {
            // this.src = src;
            this.dest = dest;
            // this.wt = wt;

        }
    }

    // ALL PATH FROM SOURCE TO TARGET ( VALID QUESTION FOR DIRECTED GRAPH )
    // A TYPE OF DFS 
    static void AllPath(ArrayList<Edge> graph[], int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path + dest);
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            AllPath(graph, e.dest, dest, path + src);

        }

    }

    public static void main(String[] args) {

        // MAKING A GRAPH 
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {                 // AT EVERY INDEX OF GRAPH LIST I HAD CREATED A ARRAYLIST OF EDGE!
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3, 1));

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

        AllPath(graph, 5, 1, "");

    }
}
