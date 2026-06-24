// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RD {

    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3, 3, 3, 5, 6, 7 };
        int n = removeDuplicates(arr);
        System.out.println(n);
    }
}
