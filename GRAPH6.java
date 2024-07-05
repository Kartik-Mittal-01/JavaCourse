
import java.util.ArrayList;

public class GRAPH6 {

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

    // DETECT CYCLE IN A GRAPH CODE 
    static boolean DetectCycleUtil(ArrayList<Edge> graph[], boolean visited[], int curr, int par) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                if (DetectCycleUtil(graph, visited, e.dest, curr)) {
                    return true;

                }

            } else if (visited[e.dest] && e.dest != par) {
                return true;
            }
        }
        return false;

    }

    static boolean DetectCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {              // to take into consideration Connected Graphs 
            if (!visited[i]) {
                if (DetectCycleUtil(graph, visited, i, -1)) {  // i represent the current node and -1 represent that the parent of starting node do not exist and hence taken to be -1!
                    return true;
                }
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

        System.out.println(DetectCycle(graph));

    }
}
