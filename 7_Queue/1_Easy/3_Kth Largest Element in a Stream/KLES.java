//https://leetcode.com/problems/kth-largest-element-in-a-stream/description/

import java.util.*;

public class KLES {

    PriorityQueue<Integer> q;
    private int k;

    public KLES(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<>();

        for (int n : nums) {
            q.offer(n);
            if (q.size() > k) {
                q.poll();
            }
        }
    }

    public int add(int val) {
        q.add(val);

        if (q.size() > k) {
            q.poll();
        }
        return q.peek();
    }

    public static void main(String args[]) {

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */