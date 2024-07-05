
public class BIT15 {

    public static int FindPower(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }                                     // HERE WE USE THE BINARY OF n TO REACH THE ANSWER -
            a = a * a;                            // if the LSB is 1 : multiply the ans(initiaze by 1) with a 
            n = n >> 1;                           // if the LSB is 0 : do nothing 
        }                                         // NOW , set a to a*a
        return ans;                               // RIGHT SHIFT (>>) n by 1 till number becomes zero 
    }

    public static void main(String[] args) {

        // FAST EXPONENTIATION ( MORE OPTIMISE WAY TO FIND THE POWER OF A NUMBER)
        System.out.println("2 RAISE TO POWER OF 6 IS : " + FindPower(2, 6));
    }
}
