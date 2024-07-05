
import java.util.PriorityQueue;

public class Heaps6 {

    static class Point implements Comparable<Point> {

        int x;
        int y;
        int ds;
        int idx;

        Point(int x, int y, int ds, int idx) {
            this.x = x;
            this.y = y;
            this.ds = ds;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return (this.ds - p2.ds);
        }
    }

    public static void main(String[] args) {

        // NEAR BY CARS ( PRINT K NEAREST CAR FROM THE ORIGIN )
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            pq.add(new Point(pts[i][0], pts[i][1], pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1], i));
        }

        for (int i = 0; i < k; i++) {
            Point p = pq.remove();
            System.out.println("C" + p.idx + " : (" + p.x + "," + p.y + ")");
        }

    }
}
