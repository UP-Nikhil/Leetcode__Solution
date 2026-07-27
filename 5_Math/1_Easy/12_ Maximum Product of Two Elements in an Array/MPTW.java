
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class MPTW {
    public int maxProduct(int[] nums) {
      /*
       Arrays.sort(nums);
       int n = nums.length-1;
        return  (nums[n]-1) * (nums[n-1] -1);
      */
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {

            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
  
    }
    public static void main(String[] args) {
        
    }
}
