
public class BT7 {

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

        // COUNT OF NODES OF A TREE

        public int CountNodes(Node root){
            
            if(root == null){
                return 0;
            }
            int LeftNodes = CountNodes(root.left);
            int RightNodes = CountNodes(root.right);
            return (LeftNodes+RightNodes+1);
        }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
       System.out.println("THE NUMBER OF NODES: " + tree.CountNodes(root) );
       
    }
}
