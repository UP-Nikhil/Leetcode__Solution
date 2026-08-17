//https://leetcode.com/problems/house-robber-ii/description/

public class HR_2 {
        public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int case1 = loot(nums, 0, n - 2);
        int case2 = loot(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int loot(int[] nums, int st, int end) {

        int[] dp = new int[nums.length];

        dp[st] = nums[st];

        if (st + 1 <= end) {
            dp[st + 1] = Math.max(nums[st], nums[st + 1]);
        }

        for (int i = st + 2; i <= end; i++) {
            dp[i] = Math.max( nums[i]+ dp[i-2], dp[i-1]);
        }

        return dp[end];
    }
    public static void main(String[] args) {
        
    }
}
