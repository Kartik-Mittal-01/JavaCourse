
public class STRINGS2 {

    public static boolean is_palindrone(String str) {

        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        // STRING IS PALINDROME OR NOT ?
        String str1 = "";
        String str2 = "k";
        String str3 = "naman";
        String str4 = "kartik";
        System.out.println("for str1: " + is_palindrone(str1));
        System.out.println("for str2: " + is_palindrone(str2));
        System.out.println("for str3: " + is_palindrone(str3));
        System.out.println("for str3: " + is_palindrone(str4));
    }
}
