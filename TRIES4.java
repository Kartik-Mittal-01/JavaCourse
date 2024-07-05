
public class TRIES4 {

    static class Node {

        Node children[] = new Node[26];
        boolean eow = false; // END OF WORD 
        int freq; // update in code 

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int lvl = 0; lvl < word.length(); lvl++) {
            int idx = word.charAt(lvl) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;  // update in code 
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

    static void findprefix(Node root, String ans) {
        if (root == null) {
            return;
        }
        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findprefix(root.children[i], ans + (char) (i + 'a'));
            }
        }

    }

    public static void main(String[] args) {

        // String words[] = {"kartik", "yash", "hardik"};
        // for (int i = 0; i < words.length; i++) {
        //     insert(words[i]);
        // }
        // root.freq = -1;  // freq of root is taken to be "-1" otherwise this would have been 1 after calling the constructor and the loop would have terminated 
        findprefix(root, "");

    }
}
