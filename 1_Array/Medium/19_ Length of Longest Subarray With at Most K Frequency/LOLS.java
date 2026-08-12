//https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/
import java.util.*;
public class LOLS {

     public int maxSubarrayLength(int[] nums, int k) {

        HashMap<Integer, Integer> m = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            m.put(nums[right], m.getOrDefault(nums[right], 0) + 1);

            while (m.get(nums[right]) > k) {
                m.put(nums[left], m.get(nums[left]) - 1);
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}