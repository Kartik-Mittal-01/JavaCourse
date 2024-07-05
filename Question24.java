
public class Question24 {

    public static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum += lastdigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        //Write a Java method to compute the sum of the digits in an integer
        System.out.println(getDigitSum(1));

    }

}
