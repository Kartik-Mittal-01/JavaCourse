
import java.util.Stack;

public class Stack6 {

    public static boolean isValidParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // VALID PARENTHESIS 
        String str1 = "[({})]";
        String str2 = "})]";
        String str3 = "[({)]";
        String str4 = "[({}]";
        System.out.println(isValidParenthesis(str1));
        System.out.println(isValidParenthesis(str2));
        System.out.println(isValidParenthesis(str3));
        System.out.println(isValidParenthesis(str4));

    }
}
