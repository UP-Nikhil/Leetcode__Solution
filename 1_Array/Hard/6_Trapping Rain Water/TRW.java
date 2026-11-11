//https://leetcode.com/problems/trapping-rain-water/description/

 public class TRW {
    /*
    public int trap(int[] height) {
        int totalWater = 0;

        for (int i = 0; i < height.length; i++) {

            int leftMax = 0;
            int rightMax = 0;

            // Left
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Right 
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            totalWater += Math.min(leftMax, rightMax) - height[i];
        }

        return totalWater;
    }

    */

  
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;

        while (left <= right) {

            // Left side chhoti hai
            if (height[left] <= height[right]) {

                // Agar new maximum mila
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                }

                // Otherwise water store hoga
                else {
                    water += leftMax - height[left];
                }

                left++;
            }

            // Right side chhoti hai
            else {

                // Agar new maximum mila
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                }

                // Otherwise water store hoga
                else {
                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        
    }

}