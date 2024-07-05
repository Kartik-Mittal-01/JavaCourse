
import java.util.ArrayList;

public class GRAPH1 {

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

        // to print all the neighbours of all the vertex!
        for (int i = 0; i < graph.length; i++) {

            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print(e.dest + " ");

            }
            System.out.println();
        }
    }
}
