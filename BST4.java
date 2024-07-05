
public class BST4 {

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

    static void PrintInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            PrintInRange(root.left, k1, k2);
            System.out.println(root.data + " ");
            PrintInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            PrintInRange(root.right, k1, k2);
        } else {
            PrintInRange(root.left, k1, k2);  // root.data > k2 
        }

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

        PrintInRange(root, 3, 8);

    }
}
