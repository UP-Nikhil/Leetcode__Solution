// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/

public class FGCDA {
    // private int GDC(int x, int y){
    //     while(x %y != 0){
    //         int rem = x % y;
    //         x = y;
    //         y = rem;
    //     }
    //     return y;
    // }
    
    public int findGCD(int[] nums) {
        /*
        Arrays.sort(nums);
        
        return GDC(nums[0], nums[nums.length -1]);
        */
        int x = nums[0];
        int y = nums[0];

        for (int num : nums) {
            x = Math.max(x, num);
            y = Math.min(y, num);
        }
        while(x %y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        
    }
}
