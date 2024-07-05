
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class GRAPH10 {

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

    // KAHN'S ALGORITHM ( TOPOLOGICAL SORT USING BST)
    static void CalIndegree(ArrayList<Edge> graph[], int indegree[]) {       // I HAD CALCULATED THE INDEGREE FOR ALL THE VERTEX OF THE GRAPH 
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indegree[e.dest]++;
            }
        }
    }

    static void TopSort(ArrayList<Edge> graph[]) {
        int indegree[] = new int[graph.length];
        CalIndegree(graph, indegree);

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        // BFS

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indegree[e.dest]--;
                if (indegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }

    }

    public static void main(String[] args) {

        // MAKING A GRAPH 
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {                 // AT EVERY INDEX OF GRAPH LIST I HAD CREATED A ARRAYLIST OF EDGE!
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

        TopSort(graph);

    }
}
