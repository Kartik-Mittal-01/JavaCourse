
public class BST3 {

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

    static Node InorderSuccessor(Node root) {
        if (root.left == null) {
            return root;
        }

        return InorderSuccessor(root.left);

    }

    static Node delete(Node root, int val) {
        // no child 1 child 2 child 

        if (val > root.data) {
            root.right = delete(root.right, val);

        } else if (val < root.data) {
            root.left = delete(root.left, val);

        } else {
            // leaf case 
            if (root.left == null && root.right == null) {
                return null;
            }
            // 1 child case ( to delete that root return that 1 child to the parent of the root)
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // 2 child ( find the inorder sucessor and replace the value of root with the value of inorder successor)
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;

    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.right = new Node(7);
        root.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);
        System.out.println();

        Inorder(root);

        System.out.println();
        delete(root, 1);

    }
}
