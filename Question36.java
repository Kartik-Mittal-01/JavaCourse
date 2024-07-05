
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question36 {

    public static boolean LLisPalindrome(LinkedList<Integer> ll) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        while (!ll.isEmpty()) {
            int data = ll.remove();
            s.push(data);
            q.add(data);
        }

        while (!q.isEmpty() && !s.isEmpty()) {
            int data1 = q.remove();
            int data2 = s.pop();
            if (data1 != data2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        //QUESTION 36 
        //We have a singly linked list of characters, write a function that returns true if the given list is a palindrome, else false.
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(1);

        System.out.println(LLisPalindrome(ll));

    }
}
