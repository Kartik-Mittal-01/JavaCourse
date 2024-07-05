
import java.util.ArrayList;

public class BST9 {

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

    static void Inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        Inorder(root.left, arr);

        arr.add(root.data);

        Inorder(root.right, arr);
    }

    static Node ToBST(ArrayList<Integer> arr, int start, int end) {  // SORTED ARRAY TO BST 

        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = ToBST(arr, start, mid - 1);
        root.right = ToBST(arr, mid + 1, end);
        return root;

    }

    static Node BalanceBST(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        Inorder(root, inorder);
        root = ToBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node(3);
        root.right.right.right = new Node(12);

        root = BalanceBST(root);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
        System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);

    }
}
