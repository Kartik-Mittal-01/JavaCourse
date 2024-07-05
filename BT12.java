
import java.util.LinkedList;
import java.util.Queue;

public class BT12 {

    static class Node {

        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // USING LEVEL ORDER TRAVERSAL 
    static void KthLevel(Node root, int k) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 0;
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                level += 1;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (level == k - 1) {
                    System.out.print(curr.data + " ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    // USING RECURSION 
    static void KthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        KthLevel(root.left, level + 1, k);
        KthLevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        KthLevel(root, 3);
        System.out.println();
        KthLevel(root, 1, 3);

    }
}
