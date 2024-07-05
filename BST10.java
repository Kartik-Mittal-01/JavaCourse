
import java.util.ArrayList;

public class BST10 {

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

    // static void Inorder1(Node root) {
    //     if (root == null) {
    //         return;
    //     }
    //     Inorder(root.left);
    //     System.out.print(root.data + " ");
    //     Inorder(root.right);
    // }
    // MERGE TWO BSTS
    // BST1-> INORDER SEQ , BST 2 -> INORDER SEQ => NEW INORDER SEQ => FINAL BST 
    // INORDER SEQ OF BST'S
    static void Inorder1(Node root) {
        if (root == null) {
            return;
        }
        Inorder1(root.left);
        System.out.print(root.data + " ");
        Inorder1(root.right);
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

    static Node MergeBST(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        Inorder(root1, arr1);
        Inorder(root2, arr2);

        ArrayList<Integer> finalarr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalarr.add(arr1.get(i));
                i++;
            } else {
                finalarr.add(arr2.get(j));
                j++;
            }
            while (i < arr1.size()) {
                finalarr.add(arr1.get(i));
                i++;
            }
            while (j < arr2.size()) {
                finalarr.add(arr2.get(j));
                j++;
            }

        }

        return ToBST(finalarr, 0, finalarr.size() - 1);

    }

    public static void main(String[] args) {

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);                           // THERE IS SOME ISSUE I DONOT KNOW WHY??

        System.out.println();
        Node root = MergeBST(root1, root2);
        Inorder1(root);

    }
}
