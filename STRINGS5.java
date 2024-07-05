
public class STRINGS5 {

    public static String SubString(String str, int si, int ei) {
        String ans = "";
        for (int i = si; i < ei; i++) {
            ans += str.charAt(i);

        }
        return ans;
    }

    // INBUILT FUNCTION TO FIND THE SUBSTRING: str.substring(si,ei);
    public static void main(String[] args) {

        //  PRINT A SUBSTRING 
        String str = "kartik";
        System.out.println(SubString(str, 0, 3)); // ENDING INDEX IS EXCLUSIVE 
    }
}
