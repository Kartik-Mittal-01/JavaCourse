
import java.util.Stack;

public class Stack4 {

    public static void StockSpan(int stocks[]) {
        int span[] = new int[stocks.length];
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currprice = stocks[i];
            while (!s.isEmpty() && stocks[s.peek()] < currprice) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int index = s.peek();
                span[i] = i - index;
            }
            s.push(i);

        }

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }

    }

    public static void main(String[] args) {
        // STOCK SPAN PROBLEM 

        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        StockSpan(stocks);
    }
}
