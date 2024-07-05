
import java.util.*;

public class Stack7 {

    public static boolean Is_Duplicate(String str) {

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {

                    s.pop();

                }

            } else {
                s.push(ch);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        // DUPLICATE PARENTHESIS 
        String str = "(a+b)";
        String str2 = "((a+b))";
        System.out.println(Is_Duplicate(str));
        System.out.println(Is_Duplicate(str2));

    }
}
