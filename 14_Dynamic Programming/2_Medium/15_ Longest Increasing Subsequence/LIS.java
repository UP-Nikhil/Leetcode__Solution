//https://leetcode.com/problems/longest-increasing-subsequence/description/

public class LIS {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int max = 0;
        int dp[] = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j], dp[i]);
                }
            }
            dp[i] += 1;
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
