//https://leetcode.com/problems/climbing-stairs/description/
public class CS {
    
 
    /*
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    */

 
    // top douwn appraoch ;
    /*

     public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return solve(n, dp);
    }

    public int solve(int n, int[] dp) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);

        return dp[n];
    }
    */



    public int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        
    }
}

