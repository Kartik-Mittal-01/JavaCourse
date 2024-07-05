
public class FUNCTIONS1 {

    public static void change(int a) { // __________
        a = 10;                                // |
    }                                          // |

    public static void main(String[] args) {  //  |  PARAMETER ARE A COPY OF ARGUMENTS 
        // CALL BY VALUE;                        |
        int number = 20;  // ____________________|
        change(number);   // |
        System.out.println(number);  // ---> original number will not change to 10.. it will remain 20 only 

    }
}
