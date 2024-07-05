
public class DP12 {

    public static boolean IsMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n + 1][m + 1];
        //BASE CASE 1 ( both s and p are empty and hence can be matched (TRUE))
        dp[0][0] = true;
        //BASE CASE 2 ( if the string is non empty and the pattern is empty then they can not be matched (FALSE))
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = false;
        }
        // BASE CASE 3 ( if the string is empty and the pattern is non empty then there are two cases)
        for (int j = 1; j < dp[0].length; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
            // else if the last character is not * then no match is possible and false is stored in them by default
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else {
                    dp[i][j] = false;
                }
            }

        }
        return dp[n][m];

    }

    public static void main(String[] args) {

        // WILDCARD MATCHING 
        String text = "aaa";
        String pattern = "a*";
        System.out.println(IsMatch(text, pattern));

    }
}
