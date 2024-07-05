
public class BASICS13 {

    public static void main(String args[]) {

        // TYPE CONVERSION --->
        int a = 10;                  // int -> float
        float b = a;
        System.err.println(b);

        char c = 'a';
        int d = c;                   // char -> int
        System.out.println(d);

        // TYPE CASTING --->
        int x = (int) (5.65f);
        System.out.println(x);

        //TYPE PROMOTION --->
        char p = 'a';
        int q = 5;
        short r = 5;
        int s = p * q * r;  // --> p q r are type promoted to int type 
        System.out.println(s);
    }
}
