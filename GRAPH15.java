
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GRAPH15 {

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

    // CHEAPEST FILGHT WITH ATMOST K STOPS 
    static class Info {

        int v;  // VERTEX 
        int c;  // COST
        int s;  // STOPS 

        Info(int v, int c, int s) {
            this.v = v;
            this.c = c;
            this.s = s;
        }
    }

    static void CreateGraph(int flights[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int cost = flights[i][2];
            Edge e = new Edge(src, dest, cost);
            graph[src].add(e);

        }
    }

    public static int CheapestFlight(int flights[][], int src, int dest, int k) {
        ArrayList<Edge> graph[] = new ArrayList[flights.length];
        CreateGraph(flights, graph);

        // DIKSTRA'S code  ( NO NEED TO TAKE A PQ , QUEUE will also work as sorting is based on the number of stops)
        int dist[] = new int[flights.length];
        for (int i = 0; i < flights.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.s > k) {
                break;
            }
            for (int i = 0; i < graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                if (curr.c + e.wt < dist[e.dest]) { // RELAXATION STEP 
                    dist[e.dest] = curr.c + e.wt;
                    q.add(new Info(e.dest, dist[e.dest], curr.s + 1));

                }
            }
        }
        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }

    }

    public static void main(String[] args) {

        int flights[][] = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dest = 2;
        int k = 1;
        System.out.println(CheapestFlight(flights, src, dest, k));

    }

}
