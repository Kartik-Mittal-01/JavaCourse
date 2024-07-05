
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    //=====================================================
    public void Addfirst(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = tail = NewNode;
            return;
        }
        NewNode.next = head;
        head = NewNode;
    }

    //=====================================================
    public void PrintLL() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;

        }
        System.out.print("Null");

    }

    //=====================================================
    public void AddMiddle(int idx, int data) {
        if (idx == 0) {
            Addfirst(data);
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //=====================================================
    public int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size += 1;
            temp = temp.next;
        }
        return size;
    }

    //=====================================================
    public int removeFirst() {
        Node temp = head;
        int size = 0;
        while (temp != null) {   // SIZE OF LL 
            size += 1;
            temp = temp.next;
        }

        if (size == 0) {
            System.out.println("NOTHING TO REMOVE i.e, LL IS EMPTY");
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int data = head.data;
        head = head.next;
        return data;

    }

    //=====================================================
    public void AddLast(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = tail = NewNode;
            return;
        }
        tail.next = NewNode;
        tail = NewNode;
    }

    //=====================================================
    public int removeLast() {
        Node temp = head;
        int size = 0;
        while (temp != null) {   // SIZE OF LL 
            size += 1;
            temp = temp.next;
        }
        if (size == 0) {
            System.out.println("NOTHING TO REMOVE i.e, LL IS EMPTY");  // BASE CASE 
        }
        if (size == 1) {
            int val = head.data;          // BASE CASE
            head = tail = null;
            return val;
        }
        Node vary = head;
        int i = 0;
        while (i < size - 2) {
            vary = vary.next;     // Temp Node
            i++;
        }
        int data = tail.data;

        vary.next = null;
        return data;

    }

    //=====================================================
    public int IterativeSearch(int key) {
        Node temp = head;
        int size = 0;
        while (temp != null) {   // SIZE OF LL 
            size += 1;
            temp = temp.next;
        }
        Node vary = head;
        for (int i = 0; i < size; i++) {
            if (vary.data == key) {
                return i;
            }
            vary = vary.next;
        }
        return -1;

    }

    //==========================================================
    public int RecursiveUtil(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (key == head.data) {
            return 0;
        }
        int index = RecursiveUtil(head.next, key);
        if (index == -1) {
            return -1;
        } else {
            return index + 1;
        }
    }

    public int RecursiveSearch(int key) {
        return RecursiveUtil(head, key);
    }
    //==========================================================

    public void ReverseLL() {
        // 3 VARIABLE 4 STEP PROCESS
        Node prev = null;
        Node curr = head = tail; // Updated the first node to tail
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;  // updated last node to HEAD 
    }

    //=====================================================
    //REMOVE THE Nth NODE FROM THE END
    // (SIZE-N+1)TH NODE FROM THE STARTING
    // INDEX OF NODE TO BE REMOVED = (SIZE-N) = IDX 
    public void RemoveFromEnd(int n) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size += 1;
            temp = temp.next;
        }

        int idx = (size - n);
        Node prev = head;
        int i = 0;
        while (i < idx - 1) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

    }

    //=====================================================
    public boolean is_palindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //=====================================================
    // DETECT A CYCLE IN LINKED LIST 
    public boolean IsCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {           //FLOYD'S CYCLE FINDING ALGORITHM
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //=================================================
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean is_cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                is_cycle = true;
                break;
            }
        }
        if (!is_cycle) {
            return;
        }
        slow = head;
        Node fast2 = fast;
        Node prev = null;
        while (slow != fast2) {
            prev = fast2;
            fast2 = fast2.next;
            slow = slow.next;
        }
        prev.next = null;
    }

    // ================================================
    public Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public Node Merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;

    }

    public Node MergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getmid(head);
        Node Righthead = mid.next;
        mid.next = null;
        Node newleft = MergeSort(head);
        Node newright = MergeSort(Righthead);
        return Merge(newleft, newright);

    }

    // ================================================
    public void ZigZag() {
        //MID 
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // REVERSE SECOND HALF 

        Node curr = mid.next;
        mid.next = null; //----->   BREAK INTO TWO PARTS
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // ZIG ZAG 
        Node left = head;
        Node right = prev;
        while (left != null && right != null) {
            Node NextL = left.next;
            left.next = right;
            Node NextR = right.next;
            right.next = NextL;
            left = NextL;
            right = NextR;
        }
    }
    // ================================================

    //QUESTION 31
    //Intersection of LinkedList with another linked list 
    public int IntersectionOfLL(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                return head1.data;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return Integer.MAX_VALUE;
    }
    // ================================================

    //QUESTION 32
    // Delete N Nodes After M Nodes of a Linked List
    public void DeleteNafterM(Node head, int M, int N) {

        Node curr = head;
        int size = 0;
        while (curr != null) {
            size += 1;               // SIZE 
            curr = curr.next;
        }
        if (N > size - M) {          // OVERFLOW CHECK 
            N = size - M;
        }

        if (head == null) {  //EMPTY LL 
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < M - 1) {
            temp = temp.next;
            i++;
        }
        Node vary = temp.next;
        int j = 0;
        while (j < N) {
            vary = vary.next;
            j++;
        }
        temp.next = vary;
    }

    // static void skipMdeleteN( Node head, int M, int N){
    //     Node curr = head, t;
    //     int count;
    //     while (curr!=null){ 
    //         for (count = 1; count < M && curr != null; count++){
    //             curr = curr.next;
    //         }
    //         if (curr == null){
    //             return;
    //         }
    //         t = curr.next;
    //         for (count = 1; count <= N && t != null; count++){
    //             Node temp = t;
    //             t = t.next;
    //         }
    //         curr.next = t;
    //         curr = t;
    //     }
    // }
    //=================================================
    //QUESTION 33
    //Swapping Nodes in a Linked List
    public void Swap(int N, int M) {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < N - 1) {
            temp = temp.next;
            i++;
        }

        Node vary = head;
        int j = 0;
        while (j < M - 1) {
            vary = vary.next;
            j++;
        }

        int faltu = temp.data;
        temp.data = vary.data;
        vary.data = faltu;

    }
    // ================================================

    // QUESTION 34 
    // Odd Even Linked List
    //We have a Linked List of integers, write a function to modify the linked list such that all even
    // numbers appear before all the odd numbers in the modified linked list. Also, keep the order of
    // even and odd numbers same. 
    // ================================================
    // QUESTION 35 

    /*
    We have K sorted linked lists of size N each, merge them and print the sorted output
    l1 = 1->3->NULL
    l2 = 6->8->NULL
    l3 = 9->10->NULL
    Sample Output 1 : 1>3->6->8->9->10->NULL
     */
    // ================================================
    public static void main(String[] args) {

        //LINKED LIST 
        LinkedList ll = new LinkedList();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);    // M = 3 , N  = 3 => 5 , 6, 7 WILL GET REMOVED 
        ll.AddLast(5);
        ll.AddLast(6);
        ll.AddLast(7);
        ll.PrintLL();
        System.out.println();

        // ll.PrintLL();
        // ll.head = ll.MergeSort(ll.head);
        // ll.ZigZag();
        // System.out.println();
        // ll.PrintLL();
        // LinkedList ll2 = new LinkedList();
        // ll2.AddLast(7);
        // ll2.AddLast(5);
        // ll2.AddLast(2);
        // ll2.AddLast(3);
        // ll2.PrintLL();
        // System.out.println();
        // System.out.println("INTERSECTION WITH LL2 IS: " + ll.IntersectionOfLL(ll.head, ll2.head));
        // ll.head = new Node(1);                            // 1-> 2 -> 3 -> 4
        // ll.head.next = new Node(2);                       //     |_________|
        // ll.head.next.next = new Node(3);
        // ll.head.next.next.next = new Node(4);
        // ll.head.next.next.next.next = ll.head.next;
        // ll.AddMiddle(2, -1); // <---------------------
        // System.out.println("ELEMENT ADDED AT INDEX 2");
        // ll.PrintLL();
        // System.out.println();
        // ll.removeFirst(); // <------------------------
        // System.out.println("FIRST ELEMENT IS REMOVED");
        // ll.PrintLL();
        // System.out.println();
        // ll.removeLast(); // <-------------------------
        // System.out.println("LAST ELEMENT REMOVED");
        // ll.PrintLL();
        // System.out.println();
        // System.out.println("4 found at index: " + ll.IterativeSearch(4));
        // System.out.println("4 found at index: " + ll.RecursiveSearch(4));
        // ll.ReverseLL();
        // System.out.println(ll.head.data);
        // ll.RemoveFromEnd(3);
        // ll.PrintLL();
        // ll.removeCycle();
        // ll.PrintLL();
    }
}
