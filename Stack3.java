
import java.util.*;

public class Stack3 {

    public static void reverseStack(Stack<Integer> s) {
        Stack<Integer> dummy = new Stack<>();

        while (!s.isEmpty()) {

            dummy.push(s.pop());

        }
        while (!dummy.isEmpty()) {
            System.out.println(dummy.pop());
        }

    }

    public static void PushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;                               // BRUTE FORCE
        }
        int top = s.pop();
        PushBottom(s, data);
        s.push(top);
    }

    public static void reverseStack_rec(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();                     // USING RECURSION 
        reverseStack_rec(s);
        PushBottom(s, top);
    }

    public static void main(String[] args) {
        // reverse a stack;

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        reverseStack(s);

    }
}
