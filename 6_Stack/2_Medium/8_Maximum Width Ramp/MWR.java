
//https://leetcode.com/problems/maximum-width-ramp/description/

import java.util.*;

public class MWR {

    // brute force thinking;
    /*
    public int maxWidthRamp(int[] nums) {
    
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length -1; j > i; j--) {
                if (nums[i] <= nums[j]) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }
    
    */

    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || nums[st.peek()] > nums[i]) {
                st.push(i);
            }
        }

        int max = 0;

        for (int j = n - 1; j >= 0; j--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[j]) {
                max = Math.max(max, j - st.peek());
                st.pop();
            }
        }

        return max;
    }
    public static void main(String[] args) {
        
    }

}