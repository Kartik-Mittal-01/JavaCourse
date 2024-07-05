
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GRAPH2 {

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

    // BREADTH FIRST SEARCH 
    static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);                                       // I HAD STARTED BFS FROM NODE "0"
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

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

        bfs(graph);

    }
}
