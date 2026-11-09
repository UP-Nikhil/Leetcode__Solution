
//https://leetcode.com/problems/subsets/?envType=problem-list-v2&envId=backtracking

import java.util.*;

 public class Subset {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(nums, new ArrayList<>(), ans);

        return ans;
    }

    public void solve(int[] nums, List<Integer> current,
                      List<List<Integer>> ans) {

        // Base case
        if (nums.length == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        int first = nums[0];

        // Remaining array
        int[] remaining = Arrays.copyOfRange(nums, 1, nums.length);

        // Include
        current.add(first);
        solve(remaining, current, ans);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude
        solve(remaining, current, ans);
    }
    public static void main(String args[]){
        
    }



}