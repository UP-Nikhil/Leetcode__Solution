// https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=problem-list-v2&envId=sliding-window

public class MAS1 {
    public  static double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        double avg = 0, maxAvg;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxAvg = (double) sum / k;

        for (int j = k; j < nums.length; j++) {

            sum = sum + nums[j];
            sum = sum - nums[j - k];

            avg = (double) sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int k=2;
        double ans= findMaxAverage(arr, k);
        System.out.println(ans);
    }
}
