//https://leetcode.com/problems/3sum/description/

import java.util.*;

public class Sum {
    public static List<List<Integer>> threeSum(int[] num) {

        /*
         * 
         * List<List<Integer>> ans = new ArrayList<>();
         * 
         * for (int i = 0; i < num.length; i++) {
         * 
         * for (int j = i + 1; j < num.length; j++) {
         * 
         * for (int k = j + 1; k < num.length; k++) {
         * 
         * if (num[i] + num[j] + num[k] == 0) {
         * List<Integer> result = new ArrayList<>();
         * 
         * result.add(num[i]);
         * result.add(num[j]);
         * result.add(num[k]);
         * 
         * Collections.sort(result);
         * 
         * ans.add(result);
         * }
         * }
         * }
         * }
         * return ans;
         * 
         */

        List<List<Integer>> ans = new ArrayList<>();

        if (num.length < 3) {
            return ans;
        }

        Arrays.sort(num);

        for (int i = 0; i < num.length - 2; i++) {

            // duplicate i skip
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = num.length - 1;

            while (left < right) {

                int sum = num[i] + num[left] + num[right];

                if (sum == 0) {

                    ans.add(Arrays.asList(num[i], num[left], num[right]));

                    while (left < right && num[left] == num[left + 1]) {
                        left++;
                    }

                    while (left < right && num[right] == num[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> ans = new ArrayList<>();

        ans = threeSum(nums);

        System.out.println(ans);

    }

}