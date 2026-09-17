//https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/

import java.util.*;

public class FMFE {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        long sum = 0;
        int max = 0;

        int i = 0, j = 0;

        while (j < nums.length) {

            sum += nums[j];

            while ((long) nums[j] * (j - i + 1) - sum > k) {
                sum -= nums[i];
                i++;
            }

            max = Math.max(max, j - i + 1);

            j++;
        }

        return max;
    }

    public static void main(String args[]) {

    }
}