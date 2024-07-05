
public class BT14 {

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

    //MINIMUM DISTANCE BETWEEN TWO NODES - FIND LCA THEN ANS=(dist btw LCA and n1) + (dist btw LCA and n2)
    static Node LCA(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }

    static int DistLCAandN(Node root, int n) {

        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftdist = DistLCAandN(root.left, n);
        int rightdist = DistLCAandN(root.right, n);
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        } else if (leftdist == -1) {
            return rightdist + 1;
        } else {
            return leftdist + 1;
        }

    }

    static int MinDist(Node root, int n1, int n2) {
        Node lca = LCA(root, n1, n2);
        int DistN1 = DistLCAandN(lca, n1);
        int DistN2 = DistLCAandN(lca, n2);

        return DistN1 + DistN2;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("MIN DISTANCE BTW 4 AND 5 IS: " + MinDist(root, 4, 2));

    }

}
