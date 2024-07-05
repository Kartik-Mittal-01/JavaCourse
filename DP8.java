
public class DP8 {

    public static int LCSString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int maxLength = 0;
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    maxLength = Math.max(dp[i][j], maxLength);
                } else {
                    dp[i][j] = 0;
                }

            }
        }
        // PRINTING THE DP ARRAY JUST TO CHECK HOW DID THE ANSWER REACHED TO 1 
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return maxLength;
    }

    public static void main(String[] args) {

        // LONGEST COMMON SUBSTRING 
        String str1 = "abcde";
        String str2 = "bd";
        System.out.println(LCSString(str1, str2));
    }
}
