//https://leetcode.com/problems/longest-common-subsequence/description/
public class LCS {
    // Top to Bottom approach;
    /*
     * private int helper(int m, int n, StringBuilder a, StringBuilder b, int
     * dp[][]){
     * if( m < 0 || n < 0) return 0;
     * if(dp[m][n] != -1) return dp[m][n];
     * if(a.charAt(m) == b.charAt(n)) return dp[m][n] = 1 + helper(m-1,n-1, a, b,
     * dp);
     * else return dp[m][n] = Math.max(helper(m,n-1, a, b, dp),helper(m-1,n, a, b,
     * dp));
     * }
     * 
     * public int longestCommonSubsequence(String text1, String text2) {
     * StringBuilder a = new StringBuilder(text1);
     * StringBuilder b = new StringBuilder(text2);
     * int m = a.length();
     * int n = b.length();
     * int dp[][] = new int [m][n];
     * for(int arr[] : dp){
     * Arrays.fill(arr, -1);
     * }
     * return helper(m-1, n-1, a, b, dp);
     * }
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {

    }
}
