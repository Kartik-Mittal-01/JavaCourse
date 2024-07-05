
import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {

    static class StackDeque {

        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }
        // STACK USING DEQUE 

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

    }

    static class QueueDeque {

        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }
        // QUEUE USING DEQUE 

        public int pop() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }

    }

    public static void main(String[] args) {

        StackDeque s = new StackDeque();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.peek());

        QueueDeque Q = new QueueDeque();
        Q.push(1);
        Q.push(2);
        Q.push(3);
        Q.push(4);

        System.out.println(Q.peek());

    }
}
