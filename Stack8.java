
import java.util.Stack;

public class Stack8 {

    // public static void NextGright(int arr[]){
    //     int result[] = new int[arr.length];
    //     Stack<Integer> s = new Stack<>();
    //     for(int i = arr.length-1 ; i>=0 ; i--){
    //         while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
    //             s.pop();
    //         }
    //         if(s.isEmpty()){
    //             result[i] = -1;
    //         }
    //         else{
    //             result[i] = arr[s.peek()];
    //         }
    //         s.push(i);
    //     }
    //     for(int j = 0 ;j<result.length ; j++){
    //         System.out.print(result[j]+" ");
    //     }
    // }
    public static int MaxAreaHistogram(int arr[]) {
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } // NEXT SMALLER LEFT
            else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        for (int j = 0; j < nsl.length; j++) {
            System.out.print(nsl[j] + " ");
        }
        System.out.println();

        Stack<Integer> s1 = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s1.isEmpty() && arr[s1.peek()] >= arr[i]) {
                s1.pop();
            }
            if (s1.isEmpty()) {
                nsr[i] = -1;
            } // NEXT SMALLER RIGHT 
            else {
                nsr[i] = s1.peek();
            }
            s1.push(i);
        }
        for (int j = 0; j < nsr.length; j++) {
            System.out.print(nsr[j] + " ");
        }
        System.out.println();

        int Max_area = 0;
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            if (currArea > Max_area) {
                Max_area = currArea;
            }
        }

        return Max_area;

    }

    public static void main(String[] args) {
        //MAXIMUM AREA IN A HISTORGRAM 

        // NEXT SMALLER LEFT 
        // NEXT SMALLER RIGHT    -->  WILL GET THE AREA  
        // HEIGHT  
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println("ARRAY OF HEIGHTS OF HISTOGRAM IS: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(MaxAreaHistogram(arr));

    }
}
