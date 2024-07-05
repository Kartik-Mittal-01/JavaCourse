
import java.util.*;

public class Stack2 {

    public static String ReverseStr(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {

        //reverse a string using a stack
        String input = "KARTIK";
        System.out.println(ReverseStr(input));

    }
}
