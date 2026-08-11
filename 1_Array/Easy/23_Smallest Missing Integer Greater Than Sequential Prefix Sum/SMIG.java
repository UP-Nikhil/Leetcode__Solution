//https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/description/

import java.util.*;
public class SMIG {
     public int missingInteger(int[] nums) {

        int sum=0;
        HashSet<Integer> s = new HashSet<>();
       for (int num : nums) {
            s.add(num);
        }
        sum += nums[0];
        for(int i =1; i < nums.length; i++){
             if(nums[i] == nums[i -1] + 1){
                sum += nums[i];
             }
             else{
                break;
             }
        }  

        while(s.contains(sum)){
                sum++;
          } 

        return sum;   
    }
    public static void main(String[] args) {
        
    }
}
