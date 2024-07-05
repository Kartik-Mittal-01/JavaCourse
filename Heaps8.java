
import java.util.PriorityQueue;

public class Heaps8 {

    static class Row implements Comparable<Row> {

        int soldiers;
        int idx;

        Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            }
            return this.soldiers - r2.soldiers;
        }
    }

    public static void main(String[] args) {

        // WEAKEST SOLDIER (either less 1 in a row , and if i<j i is weaker from if same soldier)
        int army[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {1, 1, 0, 1}};
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[i].length; j++) {
                if (army[i][j] == 1) {
                    count += 1;
                }
            }
            pq.add(new Row(count, i));
        }
        while (!pq.isEmpty()) {
            Row arm = pq.remove();
            System.out.println("A" + arm.idx + " : " + arm.soldiers + " soldiers");

        }

    }
}
