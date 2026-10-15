//https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/description/

import java.util.*;

public class FSLK {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>( (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < nums.length; i++) {
            q.offer(new int[]{nums[i], i});

            if (q.size() > k) {
                q.poll();
            }
        }

        int[][] arr = new int[k][2];

        for (int i = k - 1; i >= 0; i--) {
            arr[i] = q.poll();
        }
        
        // mantain  subsequence; Means mainatin index in sorted order;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = arr[i][0];
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}