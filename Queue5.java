
import java.util.LinkedList;
import java.util.Queue;

public class Queue5 {

    public static void Interleave(Queue<Integer> q) {
        Queue<Integer> firsthalf = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < (size / 2); i++) {
            firsthalf.add(q.remove());
        }
        while (!firsthalf.isEmpty()) {
            q.add(firsthalf.remove());
            q.add(q.remove());
        }

    }

    public static void main(String[] args) {
        // INTERLEAVE TWO HALVES OF A QUEUE
        // 1 2 3 4 5 6 ---> 1 4 2 5 3 6 

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        Interleave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }
}
