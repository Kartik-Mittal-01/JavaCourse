
import java.util.ArrayList;

public class BST5 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
    }

    static void PathToLeaf(Node root, ArrayList<Integer> path) {

        if (root == null) {

            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
            System.out.println();

        }

        PathToLeaf(root.left, path);
        PathToLeaf(root.right, path);
        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.right = new Node(7);
        root.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);

        Inorder(root);

        System.out.println();
        ArrayList<Integer> path = new ArrayList<>();
        PathToLeaf(root, path);

    }
}
