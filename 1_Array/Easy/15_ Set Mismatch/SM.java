// https://leetcode.com/problems/set-mismatch/description/

public class SM {
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
    public int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        for(int i =0; i< nums.length; i++){
            if(nums[i]!= i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{};
        
    }
    public static void main(String[] args) {
        
    }
}
