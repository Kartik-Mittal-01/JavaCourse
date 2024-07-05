
public class STRINGS4 {

    public static void main(String[] args) {

        // IMPORTANT CONCEPT 
        String s1 = "kartik";
        String s2 = "kartik";
        String s3 = new String("kartik");

        if (s1 == s2) {
            System.out.println("EQUAL");            // RETURNS EQUAL ( SAME VALUE AND SAME INTERNAL IMPLEMENTATION) 
        } else {
            System.out.println("NOT EQUAL");
        }

        if (s1 == s3) {                             // == CHECKS BOTH THE VALUE AND THE INTERNAL IMPLEMENTATION OF THE STRING s1 AND s3 ARE BOTH IMPLEMENTED IN DIFF MANNER HENCE RETURN FALSE!
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }

        if (s1.equals(s2)) {                        // .equals CHECKS ONLY THE VALUE STORES IN THE VARAIBLE HENCE RETURNS TRUE!
            System.out.println("EQUAL");

        } else {
            System.out.println("NOT EQUAL");

        }
    }
}
