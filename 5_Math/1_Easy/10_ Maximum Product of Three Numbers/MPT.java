// https://leetcode.com/problems/maximum-product-of-three-numbers/description/
import java.util.*;
public class MPT{
     public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int n1 = nums[n-1] * nums [n-2] * nums[n-3];
        int n2 = nums[0] * nums [1] * nums[n-1];
        return Math.max(n1, n2);
    }
    public static void main(String args[]){

    }
}