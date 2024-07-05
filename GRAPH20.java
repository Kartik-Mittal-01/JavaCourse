
import java.util.ArrayList;
import java.util.Stack;

public class GRAPH20 {

    static class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;

        }
    }

    static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

    }

    static void TopSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                TopSort(graph, e.dest, vis, s);
            }

        }
        s.push(curr);
    }

    static void DFS(ArrayList<Edge> graph[], int curr, boolean vis[]) {

        vis[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }

        }

    }

    static void KOSARAJU(ArrayList<Edge> graph[], int V) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        // STORING ELEMENT IN THE STACK
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                TopSort(graph, i, vis, s);
            }
        }

        // TRANSPOSE GRAPH 
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < transpose.length; i++) {
            vis[i] = false;                                                                 // TO REUSE MY "VIS" ARRAY I HAD MADE ALL THE VALUES TO FALSE AGAIN 
            transpose[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));                            // REVERSED GRAPH (TRANPOSE) : [e.dest -> e.src]
            }
        }

        // DFS ON TRANPOSE GRAPH ACC TO ELEMENTS STORED IN THE STACK 
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                DFS(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        // KOSARAJU'S ARLGORITHM ( STRONGLY CONNECTED COMPONENTS)
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);

        KOSARAJU(graph, V);

    }
}
