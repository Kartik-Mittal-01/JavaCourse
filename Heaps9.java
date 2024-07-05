
import java.util.PriorityQueue;

public class Heaps9 {

    static class Info implements Comparable<Info> {

        int value;
        int idx;

        Info(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }

        @Override

        public int compareTo(Info n2) {
            return n2.value - this.value;
        }
    }

    public static void main(String[] args) {

        // SLIDING WINDOW MAXIMUM (MAX OF ALL SUBARRYS OF SIZE K)
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int res[] = new int[arr.length - k + 1];
        PriorityQueue<Info> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(new Info(arr[i], i));
        }
        res[0] = pq.peek().value;
        for (int i = k; i < arr.length; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            pq.add(new Info(arr[i], i));
            res[i - k + 1] = pq.peek().value;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
