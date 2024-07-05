
public class BACKTRACKING3 {

    public static void FindPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            Character curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            FindPermutation(newstr, ans + curr);
        }
    }

    public static void main(String[] args) {

        // PERMUTATION OF A STRING 
        String str = "abc";
        FindPermutation(str, "");
    }
}
