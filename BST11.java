
public class BST11 {

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

    static class info {

        boolean isBST;
        int size;
        int min;
        int max;

        info(boolean isBST, int size, int max, int min) {
            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }
    static int maxBST = 0;

    static info largestBST(Node root) {
        if (root == null) {
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info leftIndfo = largestBST(root.left);
        info rightInfo = largestBST(root.right);
        int size = (leftIndfo.size + rightInfo.size + 1);
        int min = Math.min(root.data, Math.min(leftIndfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftIndfo.max, rightInfo.max));
        if (root.data <= leftIndfo.max || root.data >= rightInfo.min) {
            return new info(false, size, min, max);
        }
        if (leftIndfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new info(true, size, min, max);

        }
        return new info(false, size, min, max);

    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.right = new Node(7);
        root.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);

        System.out.println(largestBST(root).size);

    }
}
