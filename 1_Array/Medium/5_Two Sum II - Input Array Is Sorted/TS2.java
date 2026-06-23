// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/



import java.util.*;

class TS2 {
    // using two pointer
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {};
    }

    // public static int[] twoSum(int[] nums, int target) {
    // Map<Integer, Integer> map = new HashMap<>();
    // for (int i = 0; i < nums.length; i++) {
    // int need = target - nums[i];
    // if (map.containsKey(need)) {
    // return new int[] { map.get(need)+1, i+1};
    // } else {
    // map.put(nums[i], i);
    // }
    // }
    // return new int[] {};

    // }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int ans[]= twoSum(arr, 9);
        System.out.println(Arrays.toString(ans));
    }
}