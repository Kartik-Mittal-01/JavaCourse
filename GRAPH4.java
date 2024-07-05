
import java.util.ArrayList;

public class GRAPH4 {

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

    static boolean HasPath(ArrayList<Edge> graph[], int src, int dest, boolean visited[]) {
        if (src == dest) {
            return true;
        }

        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!(visited[e.dest]) && HasPath(graph, e.dest, dest, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // MAKING A GRAPH 
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {                 // AT EVERY INDEX OF GRAPH LIST I HAD CREATED A ARRAYLIST OF EDGE!
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 5));             // 1st VERTEX (1)
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));             // 2nd VERTEX (2)
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 1, 1));             // 3rd VERTEX (3)
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        graph[3].add(new Edge(3, 1, 3));             // 4th VERTEX (4)
        graph[3].add(new Edge(3, 2, 1));
        graph[4].add(new Edge(4, 2, 2));             // 5th VERTEX (5)

        System.out.println(HasPath(graph, 1, 4, new boolean[graph.length]));

    }
}
