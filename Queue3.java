
import java.util.LinkedList;
import java.util.Queue;

public class Queue3 {

    static class Stack {

        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }

        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int data;

            if (!q1.isEmpty()) {
                while (q1.size() > 1) {

                    q2.add(q1.remove());
                }
                data = q1.remove();

            } else {
                while (q2.size() > 1) {

                    q1.add(q2.remove());
                }
                data = q2.remove();

            }
            return data;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();

                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();

                    q1.add(top);
                }
            }
            return top;
        }

    }

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
