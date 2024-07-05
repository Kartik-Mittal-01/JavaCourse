
public class TRIES3 {

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

    public static boolean StartsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];

        }
        return true;
    }

    public static void main(String[] args) {

        // STARTS WITH PROBLEM ( DO THERE EXISTS ANY WORD IN TRIE DICTIONARY THAT STARTS WITH THE WORD PASSED AS PARAMETER? )
        // String words[] = {"apple", "app", "mango", "banana"};
        // for (int i = 0; i < words.length; i++) {
        //     insert(words[i]);
        // }
        // String prefix = "x";
        // System.out.println(StartsWith(prefix));
    }
}
