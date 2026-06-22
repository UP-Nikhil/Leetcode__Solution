// https://leetcode.com/problems/missing-number/description/
public class MN {
    /*
       public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=0; i<n;i++){
            if(nums[i]!=i){
                return i;
            
            }
        }
        
        return n;
    }
    */

    //using  xor operater 
    
    public int missingNumber(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
             n=n ^ i;
             n=n ^ nums[i];
        }

        return n;
    }
}
