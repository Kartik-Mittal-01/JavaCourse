
public class DoublyLL {

    public static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void printLL() {
        if (head == null) {
            System.out.println("EMPTY!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print("<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("EMPTY");
            return -1;
        } else if (head.next == null) {
            int data = head.data;
            head = tail = null;
            return data;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public void AddLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public int removeLast() {
        Node var = head;
        int size = 0;
        while (var != null) {                              // SIZE 
            var = var.next;
            size++;
        }
        if (head == null) {
            System.out.println("DLL IS EMPTY");            // BASE CASE 
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;                            // BASE CASE 
            return val;
        }
        int val = tail.data;
        Node prev = head;
        int i = 0;
        while (i < size - 2) {
            prev = prev.next;                               // FINDING THE LAST SECOND NODE (PREV)
            i++;
        }
        tail.prev = null;
        prev.next = null;
        tail = prev;

        return val;

    }

    public void ReverseDLL() {
        Node var = head;
        int size = 0;
        while (var != null) {         // SIZE 
            var = var.next;
            size++;
        }
        // 3 VARIABLE 4 STEP PROCESS
        Node prev = null;
        Node curr = head; // Updated the first node to tail
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;  // 1 EXTRA CONDITION ELSE SAME AS THAT OF LL!
            prev = curr;
            curr = next;
        }
        head = prev; // updated last node to HEAD
        Node temp = head;
        int i = 0;
        while (i < size - 1) {
            temp = temp.next;
            i++;
        }
        tail = temp;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.printLL(); // Output: 3<->2<->1null
        // dll.removeFirst();
        // dll.printLL();
        // dll.AddLast(0);

        System.out.println("LAST ELEMENT REMOVED");
        dll.removeLast();
        dll.printLL();

        System.out.println("DLL IS REVERSED");

        dll.ReverseDLL();
        dll.printLL();
        System.out.println();
        System.out.println("DATA IN TAIL NODE: " + dll.tail.data);
        System.out.println("DATA IN HEAD NODE: " + dll.head.data);

    }
}
