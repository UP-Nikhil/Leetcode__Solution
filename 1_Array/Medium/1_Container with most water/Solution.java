//https://leetcode.com/problems/container-with-most-water/description/
public class Solution {
    public static int maxArea(int nums[]) {
        int left = 0;
        int right = nums.length - 1;
        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int height = Math.min(nums[left], nums[right]);
            int area = width * height;
            maxArea = Math.max(maxArea, area);
            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 5 };
        System.out.println(maxArea(arr));
    }
}
