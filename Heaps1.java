
import java.util.PriorityQueue;

public class Heaps1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // JAVA COLLECTION FRAMEWORK -> add , remove , peek!
        pq.add(1);
        pq.add(0);
        pq.add(9);
        pq.add(5);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());   // by default highest priority is in ascending order!
            pq.remove();
        }
    }
}
