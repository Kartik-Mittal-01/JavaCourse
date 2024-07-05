
public class TRIES1 {

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

    public static void main(String[] args) {

        String words[] = {"kartik", "yash", "hardik"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("har"));

    }
}
