//https://leetcode.com/problems/split-array-largest-sum/description/

public  class SALS {

    /*
    public int splitArray(int[] nums, int k) {
    
        int low = 0;
        int high = 0;
    
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }
    
        // Linear Search
        for (int limit = low; limit <= high; limit++) {
    
            if (canSplit(nums, k, limit)) {
                return limit;
            }
        }
    
        return -1;
    }
    
    */

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canSplit(int[] nums, int k, int limit) {

        int subarrays = 1;
        int sum = 0;

        for (int num : nums) {

            if (sum + num > limit) {
                subarrays++;
                sum = num;
            } else {
                sum += num;
            }
        }

        return subarrays <= k;
    }

    public static void main(String[] args) {
        
    }
}