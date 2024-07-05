
public class CircularLL {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }
    public static Node last;

    public static Node AddToEmpty(Node last, int data) {
        if (last != null) {
            return last;
        }
        Node newnode = new Node(data);
        last = newnode;
        newnode.next = last;
        return last;
    }

    public static Node AddFront(Node last, int data) {
        if (last == null) {
            return AddToEmpty(last, data);
        }
        Node newnode = new Node(data);
        newnode.next = last.next;
        last.next = newnode;
        return last;
    }

    public static Node AddEnd(Node last, int data) {
        if (last == null) {
            return AddToEmpty(last, data);
        }
        Node newnode = new Node(data);
        newnode.next = last.next;
        last.next = newnode;
        last = newnode;

        return last;
    }

    public static void PrintCLL(Node last) {
        if (last == null) {
            System.out.println("CLL IS EMPTY");
            return;
        }
        Node temp = last.next;
        while (temp != last) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.print(last.data);

    }

    public static int Remove(Node last, int key) {
        if (last == null) {
            return -1;
        }

        if (last.next.data == key) {
            int data = last.next.data;
            last.next = last.next.next;
            return data;
        }
        if (last.data == key) {
            Node prev = last;
            while (prev.next != last) {
                prev = prev.next;
            }
            int data = last.data;
            prev.next = last.next;                  //<----------------- CAN NOT GET WHY IT'S STUCK IN THE INFINITE LOOP???
            // last = prev;

            return data;
        }

        Node vary = last.next;
        int key_pos = 1;
        while (vary.data != key) {
            key_pos++;
            vary = vary.next;
        }
        int data = vary.data;
        Node prev = last.next;
        int j = 0;
        while (j < key_pos - 2) {
            prev = prev.next;
            j++;
        }
        prev.next = prev.next.next;
        return data;

    }

    public static void main(String[] args) {
        // Node last = null;
        last = AddEnd(last, 1);
        last = AddEnd(last, 2);
        last = AddEnd(last, 3);
        last = AddEnd(last, 4);
        last = AddEnd(last, 5);

        PrintCLL(last);
        System.out.println();
        System.out.println(Remove(last, 5));

        PrintCLL(last);

    }

}
