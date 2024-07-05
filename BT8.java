
public class BT8 {

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

    static class BinaryTree {

        static int i = -1;

        public Node BuildTree(int nodes[]) {

            i++;
            if (nodes[i] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[i]);
            newnode.left = BuildTree(nodes);
            newnode.right = BuildTree(nodes);

            return newnode;

        }

        // SUM OF NODES OF A BINARY TREE
        public int SumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int LeftSum = SumOfNodes(root.left);
            int RightSum = SumOfNodes(root.right);

            return (LeftSum + RightSum + root.data);
        }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(tree.SumOfNodes(root));

    }
}
