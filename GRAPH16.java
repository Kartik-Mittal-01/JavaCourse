
import java.util.PriorityQueue;

public class GRAPH16 {

    // static class Edge {
    //     int src;
    //     int dest;
    //     int wt;
    //     public Edge(int src, int dest, int wt) {
    //         this.src = src;
    //         this.dest = dest;
    //         this.wt = wt;
    //     }
    // }
    // CONNECT CITIES -->>
    static class Pair implements Comparable<Pair> {

        int v;
        int cost;

        Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    static int ConnectCities(int cities[][]) {
        boolean vis[] = new boolean[cities.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalcost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                finalcost += curr.cost;

                for (int i = 0; i < cities[curr.v].length; i++) {
                    if (cities[curr.v][i] != 0) {
                        pq.add(new Pair(i, cities[curr.v][i]));

                    }

                }
            }
        }
        return finalcost;

    }

    public static void main(String[] args) {

        // // MAKING A GRAPH 
        // int V = 4;
        // ArrayList<Edge> graph[] = new ArrayList[V];
        // for (int i = 0; i < V; i++) {                 // AT EVERY INDEX OF GRAPH LIST I HAD CREATED A ARRAYLIST OF EDGE!
        //     graph[i] = new ArrayList<>();
        // }
        // graph[0].add(new Edge(0, 1, 10));
        // graph[0].add(new Edge(0, 2, 15));
        // graph[0].add(new Edge(0, 3, 30));
        // graph[1].add(new Edge(1, 0, 10));
        // graph[1].add(new Edge(1, 3, 40));
        // graph[2].add(new Edge(2, 0, 15));
        // graph[2].add(new Edge(2, 3, 50));
        // graph[3].add(new Edge(3, 0, 30));
        // graph[3].add(new Edge(3, 1, 40));
        // graph[3].add(new Edge(3, 2, 50));
        int cities[][] = {{0, 10, 15, 30}, {10, 0, 0, 40}, {15, 0, 0, 50}, {30, 40, 50, 0}};

        System.out.println("MINIMUM COST OF MST IS : " + ConnectCities(cities));

    }
}
