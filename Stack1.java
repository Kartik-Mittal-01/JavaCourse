
import java.util.*;

public class Stack1 {

    static class StackAL {

        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {                // STACK USING ARARY LISTS 
            return list.isEmpty();
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (list.isEmpty()) {
                return -1;
            }
            int size = list.size() - 1;
            int top = list.get(size);
            list.remove(size);
            return top;
        }

        public int peek() {
            if (list.isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class StackLL {

        static Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newnode = new Node(data);             // STACK USING LINKED LIST
            if (head == null) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }

    public static void Bottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        Bottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {

        // StackAL s = new StackAL();
        // s.push(1);
        // s.push(2);
        // s.push(3);           // 1 <- 2 <- 3 <- 4
        // s.push(4);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        // StackLL s2 = new StackLL();
        // s2.push(5);
        // s2.push(6);
        // s2.push(7);
        // s2.push(8);
        // while(!s2.isEmpty()){
        //     System.out.println(s2.peek());
        //     s2.pop();
        // }
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);           // 1 <- 2 <- 3 <- 4
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
