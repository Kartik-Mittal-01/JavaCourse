
public class BT10 {

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

    // static class BinaryTree {
    //     static int i = -1;
    //     public Node BuildTree(int nodes[]) {
    //         i++;
    //         if (nodes[i] == -1) {
    //             return null;
    //         }
    //         Node newnode = new Node(nodes[i]);
    //         newnode.left = BuildTree(nodes);
    //         newnode.right = BuildTree(nodes);
    //         return newnode;
    //     }
    // }
    static boolean isIdentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        } else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }
        if (!isIdentical(node.left, subroot.left)) {
            return false;
        } else if (!isIdentical(node.right, subroot.right)) {
            return false;
        }
        return true;
    }

    static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }

        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(6);

        System.out.println(isSubtree(root, subroot));
    }

}
