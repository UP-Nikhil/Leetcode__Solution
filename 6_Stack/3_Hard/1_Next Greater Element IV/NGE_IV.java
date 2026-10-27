//https://leetcode.com/problems/next-greater-element-iv/description/

import java.util.*;
public class NGE_IV {

    //brute force;
    /*
    public int[] secondGreaterElement(int[] nums) {
    
        int[] ans = new int[nums.length];
    
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            ans[i] = -1;
    
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    count++;
    
                    if (count == 2) {
                        ans[i] = nums[j];
                        break;
                    }
                }
            }
        }
    
        return ans;
    }
    */
   
    public int[] secondGreaterElement(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Step 1: Find second greater element
            while (!second.isEmpty() &&
                   nums[i] > nums[second.peek()]) {

                ans[second.pop()] = nums[i];
            }

            // Step 2: Find first greater element
            while (!first.isEmpty() &&
                   nums[i] > nums[first.peek()]) {

                temp.push(first.pop());
            }

            // Step 3: Maintain correct order in second stack
            while (!temp.isEmpty()) {
                second.push(temp.pop());
            }

            // Step 4: Current element
            first.push(i);
        }

        return ans;
    }
}

