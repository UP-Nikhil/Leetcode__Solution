// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
import java.util.*;

public class FAND {
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

    public List<Integer> findDisappearedNumbers(int[] nums) {

        cyclicSort(nums);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
