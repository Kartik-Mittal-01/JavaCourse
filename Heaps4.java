
import java.util.ArrayList;

public class Heaps4 {

    // max heap
    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;               // index of added element 
            int p = (x - 1) / 2;                  // index of parent of added element 
            while (arr.get(p) < arr.get(x)) {    // sign change 
                int temp = arr.get(x);
                arr.set(x, arr.get(p));
                arr.set(p, temp);
                x = p;
                p = (x - 1) / 2;
            }
        }

        public void print() {
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i) + " ");
            }
        }

        // top most element   
        public int peek() {
            return arr.get(0);
        }

        // remove the top element from the heap! 
        //( swap first and last element of array -> delete last element (which is now the top most element of heap) -> heapify the remaining array)
        public void heapify(int i) {
            int left = (2 * i + 1);
            int right = (2 * i + 2);
            int minIdx = i;
            if (left < arr.size() && arr.get(minIdx) < arr.get(left)) {  // sign change 
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) < arr.get(right)) {  // sign change 
                minIdx = right;
            }
            if (minIdx != i) {
                // swap arr[minIdx] and arr[i]
                int temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(i));
                arr.set(i, temp);

                heapify(minIdx);

            }
        }

        public int remove() {
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            arr.remove(arr.size() - 1);

            //HEAPIFY
            heapify(0);
            return data;

        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }

    }

    public static void main(String[] args) {
        // MAX HEAP -> MAX ELEMENT HAS MOST PRIORITY ( value of parent is greater than the value of child )
        // MIN HEAP -> MIN ELEMENT HAS MOST PRIORITY  ( value of child is greater than the value of parent )

        // THINK AS BINARY TREE IMPLEMENTS AS ARRAY
        // node(i) => node.left(2i+1) , node.right(2i+2)
        // child(x) - > parent(x-1/2)
        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);       // Given heap
        h.add(5);

        while (!h.isEmpty()) {
            System.err.println(h.peek() + " ");
            h.remove();
        }

    }
}
