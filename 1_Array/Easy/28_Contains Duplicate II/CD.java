//https://leetcode.com/problems/contains-duplicate-ii/description/



import java.util.*;
public class CD {
    

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                int lastIndex = map.get(nums[i]);
                int len = Math.abs(i - lastIndex);

                if (len <= k) {
                    return true;
                }
            }
            
            map.put(nums[i], i);
        }

        return false;

    }

    /*
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
    
        for (int i = 0; i < nums.length; i++) {
    
            if (map.containsKey(nums[i])) {
                int lastIndex = map.get(nums[i]);
    
                if (Math.abs(i - lastIndex) <= k) {
                    return true;
                }
            }
    
            map.put(nums[i], i);
        }
    
        return false;
    }
    */
      public static void main(String[] args) {
    
   }
}
