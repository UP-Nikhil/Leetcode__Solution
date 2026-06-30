// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FFLE {
     public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        return new int[]{first, last};
    }
    public static void main(String[] args) {
        
    }
}
