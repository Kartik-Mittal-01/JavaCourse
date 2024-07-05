
import java.util.ArrayList;

public class GRAPH8 {

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

    // CYCLE DETECTION IN DIRECTED GRAPH 
    static boolean isCyclicUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) {
                return true;                                      // IF THE VERTEX WE R TRYING TO POINT ALREADY EXISTS IN THE STACK THEN IT MEANS CYCLE EXISTS!
            }
            if (!vis[e.dest]) {
                if (isCyclicUtil(graph, e.dest, vis, stack)) {
                    return true;
                }
            }
        }
        stack[curr] = false;
        return false;
    }

    static boolean isCyclic(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCyclicUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // MAKING A GRAPH 
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {                 // AT EVERY INDEX OF GRAPH LIST I HAD CREATED A ARRAYLIST OF EDGE!
            graph[i] = new ArrayList<>();
        }

        // NON CYCLIC GRAPH 
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 1, 1));

        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 3, 1));

        ArrayList<Edge> graph1[] = new ArrayList[4];
        for (int i = 0; i < V; i++) {                 // AT EVERY INDEX OF GRAPH LIST I HAD CREATED A ARRAYLIST OF EDGE!
            graph1[i] = new ArrayList<>();
        }

        // CYCLIC GRAPH 
        graph1[0].add(new Edge(0, 2, 1));

        graph1[1].add(new Edge(1, 0, 1));

        graph1[2].add(new Edge(2, 3, 1));

        graph1[3].add(new Edge(3, 1, 1));

        System.out.println(isCyclic(graph)); // false 
        System.out.println(isCyclic(graph1)); // true 

    }
}
