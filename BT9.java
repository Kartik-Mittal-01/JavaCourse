
public class BT9 {

    static class Node {

        // int data;
        Node right;
        Node left;

        Node(int data) {
            // this.data = data;
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

        public int Height(Node root) {
            if (root == null) {
                return 0;
            }
            int left = Height(root.left);
            int right = Height(root.right);
            // PASS THROUGH THE ROOT NODE
            return (1 + Math.max(left, right));

        }

        // #1
        public int Diamter(Node root) {
            if (root == null) {
                return 0;
            }
            // PASSES TH. ROOT NODE
            int lh = Height(root.left);
            int rh = Height(root.right);
            int diameter1 = (lh + rh + 1);
            // EITHER IN LEFT SUBTREE OR RIGHT SUBTREE 
            int diameter2 = Diamter(root.left);
            int diameter3 = Diamter(root.right);
            return (Math.max(diameter1, Math.max(diameter2, diameter3)));

        }

        // #2 ( SAME CONCEPT USING CLASS)
        static class Info {

            int diameter;
            int height;

            Info(int diameter, int height) {
                this.diameter = diameter;
                this.height = height;
            }
        }

        public Info diameter(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int FinalDiameter = Math.max(leftInfo.height + rightInfo.height + 1, Math.max(leftInfo.diameter, rightInfo.diameter));
            int FinalHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

            return new Info(FinalDiameter, FinalHeight);

        }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println("THE DIAMETER OF BINARY TREE IS: " + tree.Diamter(root));
        System.out.println("THE DIAMETER OF BINARY TREE IS: " + tree.diameter(root).diameter);

    }
}
