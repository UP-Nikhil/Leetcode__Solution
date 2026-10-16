//https://leetcode.com/problems/maximal-score-after-applying-k-operations/description/

import  java.util.*;
public class MSAO {
    

    public long maxKelements(int[] nums, int k) {

        if (k == 0){
            return (long)0;
        }

        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> Integer.compare(b, a));

        for (int i = 0; i < nums.length; i++) {
            q.offer(nums[i]);
        }

        long score = 0;

        while (k > 0) {
            int val = q.poll();
            score += val;
            q.offer((val + 2) / 3);
            k--;
        }

        return score;
    }
    public static void main(String[] args) {
        
    }
}

