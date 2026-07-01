// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
import java.util.*;
public class FDA {
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
    public List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i< nums.length; i++){
            if(nums[i]!= i+1){
                list.add(nums[i]);
            }
        }
        return list;
        
    }
    public static void main(String[] args) {
        
    }
}
