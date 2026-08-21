//Minimum Insertion Steps to Make a String Palindrome
public class MISTMS {
    private int longestPalindromeSubseq(String s) {
        int m = s.length();
        // main logic
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        String s2 = rev.toString();

        // Longest Common Subsequence rule are use;
        int[][] dp = new int[m + 1][m + 1];
        dp[0][0] = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][m];
    }

    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }
    public static void main(String[] args) {
        
    }

}