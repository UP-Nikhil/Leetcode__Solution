//https://leetcode.com/problems/target-sum/description/

public class TS {
     private int way( int i , int nums[] , int target){
        if(i == nums.length) {
            if(target == 0) return 1;
            else return 0;
        }
        int sub = way(i+1, nums, target + nums[i]);
        int add = way(i+1, nums, target - nums[i]);
        return add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return way(0, nums, target);
        
    }
    public static void main(String[] args) {
        
    }
}
