//https://leetcode.com/problems/coin-change/description/
 import java.util.*;
public class CC {
     // Unbounded knapstakc;
    private long helper(int arr[], int i, int target , int dp[][]) {
        if (i == arr.length) {
            if (target == 0)
                return 0;
            else
                return Integer.MAX_VALUE;
        }
        if(dp[i][target] != -1) return dp[i][target];
        if (target - arr[i] >= 0) {
            long skip = helper(arr, i + 1, target, dp);
            long take = 1 + helper(arr, i, target - arr[i], dp);
            return dp[i][target] =(int) Math.min(skip, take);
        } else {
           return  dp[i][target] = (int) helper(arr, i + 1, target , dp);
        }
    }

    public int coinChange(int[] coins, int amount) {

        int dp[][]= new int [coins.length][amount+1];
        for(int arr[] : dp){
            Arrays.fill(arr, -1);
        }

        int ans = (int)helper(coins, 0, amount ,dp);
        if(ans== Integer.MAX_VALUE) return -1;
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
