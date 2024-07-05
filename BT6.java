
import java.util.LinkedList;
import java.util.Queue;

public class BT6 {

    static class Node {

        // int data;
        Node right;
        Node left;

        Node(int data) {
            // this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int i = -1;

        public Node BuildTree(int nodes[]) {

            i++;
            if (nodes[i] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[i]);
            newnode.left = BuildTree(nodes);
            newnode.right = BuildTree(nodes);

            return newnode;

        }
        // HEIGHT OF BINARY USING THE LEVEL TRAVERSAL 

        public int Height(Node root) {
            if (root == null) {
                return 0;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            int Height = 0;
            while (!q.isEmpty()) {

                Node curr = q.remove();

                if (curr == null) {
                    Height++;
                    if (q.isEmpty()) {
                        break;
                    }
                    q.add(null);
                } else {
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
            System.out.println("HEIGHT OF THE BINARY TREE IS: " + Height);

            return Height;

        }

        // HEIGHT OF BINARY TREE USING RECURSION 
        public int HEIGHT(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = HEIGHT(root.left);
            int rh = HEIGHT(root.right);
            return Math.max(lh, rh) + 1;

        }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        tree.Height(root);
        System.out.println(tree.HEIGHT(root));

    }
}
