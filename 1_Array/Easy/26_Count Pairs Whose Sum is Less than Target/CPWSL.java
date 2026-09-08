//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

import java.util.*;

public class CPWSL {
    public static  int countPairs(List<Integer> nums, int target) {
        /* 

        // Brute Force 
           // Time Complexcity  0(nlog(n));
        // Space Complexcity 0(1);


        int count =0;
        for(int i =0; i< nums.size(); i++){
            for(int j =i+1; j < nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }
        return count; 
        
        */

        // Time Complexcity  0(nlog(n));
        // Space Complexcity 0(n);

        Collections.sort(nums);
        int i = 0;
        int j = nums.size() - 1;

        int count = 0;

        while (i < j) {

            if (nums.get(i) + nums.get(j) >= target) {
                j--;
            } else {
                count += (j - i);
                i++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
      
      int[]  nums = {-1,1,2,3,1};
      int target = 2;

      List<Integer> num = new ArrayList<>();
      for(int i=0; i< nums.length; i++){
        num.add(nums[i]);
      }
      
        System.out.println(countPairs(num, target));
    }

}