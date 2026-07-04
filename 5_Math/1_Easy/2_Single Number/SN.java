//https://leetcode.com/problems/single-number/description/
class SN{
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int n : nums ){
            unique = unique ^ n;
        }
        return unique;
    }
    public static void main(String args[]){
        
    }
}