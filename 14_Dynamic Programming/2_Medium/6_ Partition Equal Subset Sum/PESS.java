//https://leetcode.com/problems/partition-equal-subset-sum/description/

public class PESS {
    
    public boolean canPartition(int[] nums) {

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;

        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return subset(0, target, nums, dp);
    }

    private static boolean subset(int i, int target, int arr[], Boolean[][] dp) {
        if (target == 0)
            return true;

        if (i >= arr.length || target < 0)
            return false;

        if (dp[i][target] != null)
            return dp[i][target];

        boolean skip = subset(i + 1, target, arr, dp);
        boolean take = subset(i + 1, target - arr[i], arr, dp);

        return dp[i][target] = take || skip;
    }
    public static void main(String[] args) {
        
    }
}
