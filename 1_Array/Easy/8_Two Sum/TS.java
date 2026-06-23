// https://leetcode.com/problems/two-sum/description/

import java.util.HashMap;
import java.util.Map;

public class TS {

    // brute fource;

    // public static int[] twoSum(int[] nums, int target) {
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // return new int[] { i, j };
    // }
    // }
    // }
    // return new int[] {};
    // }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};

    }

}