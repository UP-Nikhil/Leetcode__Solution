//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/

import java.util.*;
public class LPITEW {
 

    // Brute Force;
    /*
    public int findMaxK(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length - 1; i++) {
    
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + (nums[j]) == 0) {
    
                    ans = Math.max(Math.abs(nums[i]), ans);
    
                }
            }
        }
    
        if (ans > -1) {
            return ans;
        }
        return ans;
    }
    
    */

    public int findMaxK(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int max = -1;

        for (int num : nums) {
            if (!s.contains(-num)) {
                s.add(num);
            } else {
                max = Math.max(max, Math.abs(num));
            }
        }

        return max;
    }
    public static void main(String[] args) {
        
    }
}

