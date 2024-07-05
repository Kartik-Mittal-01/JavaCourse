
public class TRIES6 {

    static class Node {

        Node children[] = new Node[26];
        boolean eow = false; // END OF WORD 

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }
    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int lvl = 0; lvl < word.length(); lvl++) {
            int idx = word.charAt(lvl) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];

        }
        curr.eow = true;

    }

    public static boolean search(String key) {
        Node curr = root;
        for (int lvl = 0; lvl < key.length(); lvl++) {
            if (curr.children[key.charAt(lvl) - 'a'] == null) {
                return false;
            }
            curr = curr.children[key.charAt(lvl) - 'a'];
        }
        return curr.eow == true;
    }

    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {

        // COUNT UNIQUE SUBSTRINGS -> unique substrings are equal to number of nodes in the TRIE ( which is created by all the suffix of the given word)
        String word = "ababa";
        //creating a trie of all suffix->
        for (int i = 0; i < word.length(); i++) {
            String suffix = word.substring(i);
            insert(suffix);
        }

        System.out.println("UNIQUE SUBSTRINGS: " + countNodes(root));

    }
}
