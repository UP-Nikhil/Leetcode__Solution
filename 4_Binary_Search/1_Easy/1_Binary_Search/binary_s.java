//https://leetcode.com/problems/binary-search/description/

public class binary_s {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int tr= search(arr, 9);
        System.out.println(tr +" ");
    }
}
