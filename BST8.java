
public class BST8 {

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

    static Node ToBST(int arr[], int start, int end) {  // SORTED ARRAY TO BST 

        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = ToBST(arr, start, mid - 1);
        root.right = ToBST(arr, mid + 1, end);
        return root;

    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 7};
        Node root = ToBST(arr, 0, arr.length - 1);
        Inorder(root);
        System.out.println();

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

    }
}
