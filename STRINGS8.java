
public class STRINGS8 {

    public static String ConvertToUppercase(String str) {

        StringBuilder sb = new StringBuilder("");
        Character ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {

        // CONVERT FIRST CHARACTER OF EACH WORD TO UPPERCASE 
        String str = "kartik mittal is a coder";
        System.out.println(ConvertToUppercase(str));

    }
}
