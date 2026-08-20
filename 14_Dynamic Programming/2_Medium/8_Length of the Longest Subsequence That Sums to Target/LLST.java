//https://leetcode.com/problems/length-of-the-longest-subsequence-that-sums-to-target/description/
import java.util.*;
public class LLST {
    // 0 / 1 Knapstack algo use;
    private int helper(int i, List<Integer> nums, int target, int dp[][]) {
        if (i == nums.size()) {
            if (target == 0)
                return 0;
            else
                return Integer.MIN_VALUE;
        }
        if (dp[i][target] != -1)
            return dp[i][target];

        if (target - nums.get(i) >= 0) {
            int skip = helper(i + 1, nums, target, dp);
            int result = helper(i + 1, nums, target - nums.get(i), dp);
            int take = Integer.MIN_VALUE;
            if (result != Integer.MIN_VALUE) {
                take = 1 + result;
            }
            return dp[i][target] = Math.max(skip, take);
        } else {
            return dp[i][target] = helper(i + 1, nums, target, dp);
        }
    }

    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        int dp[][] = new int[nums.size()][target + 1];
        for (int arr[] : dp) {
            Arrays.fill(arr, -1);
        }

        int ans = helper(0, nums, target, dp);
        if (ans == Integer.MIN_VALUE)
            return -1;
        return ans;

    }

    public static void main(String[] args) {

    }
}
