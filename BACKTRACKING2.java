
public class BACKTRACKING2 {

    public static void printAllSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");

            } else {
                System.out.println(ans);

            }
            return;
        }
        printAllSubsets(str, ans + str.charAt(i), i + 1);  // RECURSION STEP 
        printAllSubsets(str, ans, i + 1);                  // BACKTRACKING STEP 
    }

    public static void main(String[] args) {

        // PRINT ALL THE SUBSETS OF A STRING 
        String str = "abc";
        printAllSubsets(str, "", 0);
    }
}
