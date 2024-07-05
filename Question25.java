
public class Question25 {

    public static boolean is_palindrome(int n) {
        int original = n;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {

        System.out.println(is_palindrome(1));

        /*
         Write a Java program to check if a number is a palindrome in Java? ( 121 is a
        palindrome, 321 is not)
         */
    }
}
