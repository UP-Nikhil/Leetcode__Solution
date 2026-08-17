//https://leetcode.com/problems/house-robber/description/

public class HR {
    /*
     * public int rob(int[] nums) {
     * if (nums == null || nums.length == 0)
     * return 0;
     * if (nums.length == 1)
     * return nums[0];
     * 
     * int first = 0;
     * int sec = 0;
     * 
     * for (int num : nums) {
     * int current = Math.max(first, sec + num);
     * sec = first;
     * first = current;
     * }
     * 
     * return first;
     * 
     * 
     * }
     * 
     * 
     * // DP recursin + Memorization (Top Down)
     * private int amount(int arr[], int i, int dp[]){
     * if( i >= arr.length) return 0;
     * if(dp[i] != -1) return dp[i];
     * int take = arr[i] + amount(arr, i+2 ,dp);
     * int skip = amount (arr, i+1, dp);
     * return dp[i] = Math.max(take , skip);
     * }
     * 
     * public int rob(int[] nums) {
     * int n = nums.length;
     * int dp[] = new int[n];
     * Arrays.fill(dp, -1);
     * return amount(nums, 0,dp);
     * }
     * 
     */
    // DP Tabularform ( Bottom UP);
    public int rob(int[] nums) {

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] += Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];

    }

    public static void main(String[] args) {

    }
}
