
public class Queue1 {

    static class QueueArrays {

        static int arr[];
        static int size;
        static int rear;

        QueueArrays(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("QUEUE IS FULL");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;                                                          ///  QUEUE USIGN ARRAYS
        }

        public int remove() {
            if (rear == -1) {
                System.out.println("QUEUE IS ALREADY EMPTY!");
                return -1;
            }
            if (rear == 0) {
                int data = arr[rear];
                rear = -1;
                return data;
            }
            int value = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return value;
        }

        public int peek() {
            if (rear == -1) {
                System.out.println("QUEUE IS EMPTY!");
                return -1;
            }
            return arr[0];
        }

        public void print() {
            if (rear == -1) {
                System.out.println("EMPTY!");
            }
            while (!isEmpty()) {
                System.out.print(remove() + " ");
            }
        }
    }

    static class CircularQueue {

        static int arr[];
        int rear;
        int front;
        int size;

        CircularQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;                                                  // CIRCULAR QUEUES
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("NO MORE SPACE IN QUEUE");
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("QUEUE IS EMPTY");
                return -1;
            }
            return arr[front];
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("QUEUE IS ALREADY EMPTY!");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;

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

    static class QueueLL {

        static Node head = null;
        static Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {

        QueueArrays q = new QueueArrays(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.print();
        System.out.println();

        QueueLL q1 = new QueueLL();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        CircularQueue cq = new CircularQueue(4);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        while (!cq.isEmpty()) {
            System.out.print(cq.peek() + " ");
            cq.remove();
        }
        System.out.println();

        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);

        cq.remove();
        cq.add(9);
        while (!cq.isEmpty()) {
            System.out.print(cq.peek() + " ");
            cq.remove();
        }

    }
}
