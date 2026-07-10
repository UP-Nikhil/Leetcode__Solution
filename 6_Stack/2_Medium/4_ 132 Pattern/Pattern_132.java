//https://leetcode.com/problems/132-pattern/description/
import java.util.*;
public class Pattern_132 {
    public boolean find132pattern(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int second = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {

            
            if (nums[i] < second) {
                return true;
            }         
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                second = stack.pop();
            }      
            stack.push(nums[i]);
        }

        return false;
    }
    public static void main(String[] args) {
        
    }
}
