
public class TRIES7 {

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
    public static String ans = "";

    static void LongestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                Character ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                LongestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);

            }
        }

    }

    public static void main(String[] args) {

        // FIND LONGEST WORD SUCH THAT ALL THE PREFIX OF THAT WORD ARE ALREADY PRESENT IN THE WORDS LIST 
        // String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        // //creating a trie of all suffix->
        // for (int i = 0; i < words.length; i++) {
        //     insert(words[i]);
        // }
        LongestWord(root, new StringBuilder(""));
        // System.out.println(ans);

    }
}
