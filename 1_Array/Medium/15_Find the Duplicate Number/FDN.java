//https://leetcode.com/problems/find-the-duplicate-number/description/
public class FDN {
    private void cyclicSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            } else {
                i++;
            }
        }
    }
    public int findDuplicate(int[] nums) {
        cyclicSort(nums);
        for(int i=0; i< nums.length; i++){
            if(nums[i]!= i+1){
                return nums[i];
            }
        } 
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
