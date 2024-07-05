
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BT11 {

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

    // static class BinaryTree {
    //     static int i = -1;
    //     public Node BuildTree(int nodes[]) {
    //         i++;
    //         if (nodes[i] == -1) {
    //             return null;
    //         }
    //         Node newnode = new Node(nodes[i]);
    //         newnode.left = BuildTree(nodes);
    //         newnode.right = BuildTree(nodes);
    //         return newnode;
    //     }
    // }
    // PRINT THE TOP VIEW OF A BINARY TREE -->
    static class Info {

        Node node;
        int hd;

        Info(Node node, int hd) {               // INFO -> Node , hor.dist 
            this.node = node;
            this.hd = hd;
        }
    }

    static void TopView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();      // key->hd , value->node
        q.add(new Info(root, 0));
        q.add(null);
        int min = 0;
        int max = 0;
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }

        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }

    }

    public static void main(String[] args) {
        // int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.BuildTree(nodes);
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        TopView(root);
    }
}
