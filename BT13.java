
import java.util.ArrayList;

public class BT13 {

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

    // LOWEST COMMON ANCESTOR (METHOD 1 )
    static boolean Getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean leftFound = Getpath(root.left, n, path);
        boolean rightFound = Getpath(root.right, n, path);
        if (leftFound || rightFound) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;

    }

    static Node LCA(Node root, int a, int b) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        Getpath(root, a, path1);
        Getpath(root, b, path2);
        for (int i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                return path1.get(i - 1);
            }
        }
        return null;
    }

    // LCA (METHOD 2 )
    static Node lca(Node root, int a, int b) {
        if (root == null || root.data == a || root.data == b) {
            return root;
        }
        Node leftside = lca(root.left, a, b);
        Node rightside = lca(root.right, a, b);
        if (leftside == null) {
            return rightside;
        }
        if (rightside == null) {
            return leftside;
        }
        return root;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("LOWEST COMMON ANCESTOR IS: " + LCA(root, 4, 5).data);
        System.out.println("LOWEST COMMON ANCESTOR IS: " + lca(root, 4, 5).data);

    }
}
