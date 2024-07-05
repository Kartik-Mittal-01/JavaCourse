
public class RECURSION10 {

    public static Void RemoveDup(String str, int i, StringBuilder sb, boolean map[]) {
        if (i == str.length()) {
            System.out.println(sb.toString());
            return null;
        }
        Character ch = str.charAt(i);
        if (map[ch - 'a']) {
            RemoveDup(str, i + 1, sb, map);
        } else {
            map[ch - 'a'] = true;
            RemoveDup(str, i + 1, sb.append(ch), map);
        }

        return null;
    }

    public static void main(String[] args) {

        // REMOVE DUPLICATES IN A STRING 
        String str = "appnnacollege"; // -> "apnacoleg"
        System.out.println("REMOVING THE DUPLICATE: ");
        RemoveDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
