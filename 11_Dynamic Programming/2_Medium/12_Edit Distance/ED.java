//https://leetcode.com/problems/edit-distance/description/

import java.util.*;
public class ED {

    // DP Top Down approach;

    public int minSteps(int i, int j, String a, String b, int[][] dp) {
        if (i == -1)
            return j + 1;
        if (j == -1)
            return i + 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = minSteps(i - 1, j - 1, a, b, dp);
        } else {
            int ins = minSteps(i, j - 1, a, b, dp);
            int del = minSteps(i - 1, j, a, b, dp);
            int rep = minSteps(i - 1, j - 1, a, b, dp);
            return dp[i][j] = 1 + Math.min(del, Math.min(ins, rep));
        }
    }

    public int minDistance(String a, String b) {
        int m = a.length(), n = b.length();

        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return minSteps(m - 1, n - 1, a, b, dp);
    }

    public static void main(String[] args) {

    }
}