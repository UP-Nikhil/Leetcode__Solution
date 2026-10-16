//https://leetcode.com/problems/maximum-product-after-k-increments/description/

import java.util.*;

public class MPAK {

    public int maximumProduct(int[] nums, int k) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }

        while (k > 0) {
            int val = q.poll();
            val++;
            q.offer(val);
            k--;
        }

        long ans = 1;
        long mod = 1_000_000_007;

        while (!q.isEmpty()) {
            int val = q.poll();
            ans = (ans * val) % mod;
        }

        return (int) ans;
    }

    public static void main(String[] args) {

    }
}
