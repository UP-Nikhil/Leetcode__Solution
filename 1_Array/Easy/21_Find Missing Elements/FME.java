// https://leetcode.com/problems/find-missing-elements/description/

import java.util.*;
class FME {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
      
        HashSet<Integer> st = new HashSet<>();
        for( int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
            st.add(num);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = min+1 ; i < max; i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}
