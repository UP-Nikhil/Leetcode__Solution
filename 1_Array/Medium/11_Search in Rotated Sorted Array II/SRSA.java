
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class SRSA {
     public boolean search(int[] nums, int target) {
        
        for(int i =0; i< nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
