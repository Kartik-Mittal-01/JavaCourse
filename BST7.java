
public class BST7 {

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

    static Node Mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftSubtree = Mirror(root.left);
        Node rightSubtree = Mirror(root.right);
        root.left = rightSubtree;
        root.right = leftSubtree;
        return root;
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

        // PRINT THE MIRROR BINARY SEARCH TREE
        Mirror(root);
        Inorder(root);

    }
}
