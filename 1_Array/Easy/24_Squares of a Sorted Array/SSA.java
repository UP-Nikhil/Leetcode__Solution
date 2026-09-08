
//https://leetcode.com/problems/squares-of-a-sorted-array/description/

import java.util.Arrays;

 public class SSA {
    public static  int[] sortedSquares(int[] nums) {

        /*
        int n = nums.length;
        for(int i= 0 ; i< n; i++){
            nums[i] *= nums[i];
        }
        
        int i =0;
        int j = 1;
        Arrays.sort(nums);
        return nums;
        
        */

        int i = 0;
        int j = nums.length - 1;
        int k = j;

        int[] ans = new int[j + 1]; // store answer;

        while (i <= j) {

            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                ans[k] = nums[i] * nums[i];
                i++;

            } else {

                ans[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }

        return ans;
    }
    public static void main(String[] args) {
         
        int[] arr = {-4,-1,0,3,10};
     // int result [] = sortedSquares(arr);
   //  System.out.println(Arrays.toString(result));
     
     System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}