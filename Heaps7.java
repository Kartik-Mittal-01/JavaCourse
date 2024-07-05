
import java.util.PriorityQueue;

public class Heaps7 {

    public static void main(String[] args) {

        // CONNECT N ROPES 
        int ropes[] = {4, 3, 2, 6};
        // (2)+(3), C=5 
        // (5)+4 , C=9  TOTAL COST-> 5+9+15 = 29 (THIS SHOULD BE MINIMUM)
        // (9)+6 , C=15 

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        int cost = 0;
        while (pq.size() > 1) {
            int length1 = pq.remove();
            int length2 = pq.remove();
            cost += (length1 + length2);
            pq.add(length1 + length2);

        }
        System.out.println("min cost to join the ropes is: " + cost + " Rs.");

    }
}
