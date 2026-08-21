//https://leetcode.com/problems/longest-palindromic-subsequence/description/
public class LPS {
      // Top to Bottom approach;
   /*
    private int helper(int m, int n, StringBuilder a, StringBuilder b, int dp[][]) {
        if (m < 0 || n < 0)
            return 0;
        if (dp[m][n] != -1)
            return dp[m][n];
        if (a.charAt(m) == b.charAt(n))
            return dp[m][n] = 1 + helper(m - 1, n - 1, a, b, dp);
        else
            return dp[m][n] = Math.max(helper(m, n - 1, a, b, dp), helper(m - 1, n, a, b, dp));
    }

    public int longestPalindromeSubseq(String s) {
        StringBuilder a = new StringBuilder(s);
        StringBuilder b = new StringBuilder(s).reverse();
        int m = a.length();
        int n = b.length();
        int dp[][] = new int[m][n];
        for (int arr[] : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(m - 1, n - 1, a, b, dp);
    }
 */
    public int longestPalindromeSubseq(String s) {
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
    public static void main(String[] args) {
        
    }
}
