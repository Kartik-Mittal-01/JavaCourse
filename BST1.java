
public class BST1 {

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

    static Node Insert(Node root, int val) {
        if (root == null) {
            Node newnode = new Node(val);
            root = newnode;
            return root;
        }
        if (val < root.data) {  // Left subtree
            root.left = Insert(root.left, val);

        } else {
            root.right = Insert(root.right, val);
        }
        return root;
    }

    static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {

        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);

        }

        Inorder(root);

    }
}
