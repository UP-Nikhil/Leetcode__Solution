//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/

public class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int avg = sum / k;
        int count = 0;

        if (avg >= threshold) {
            count++;
        }

        for (int i = k; i < n; i++) {

            sum = sum + arr[i] - arr[i - k];
            avg = sum / k;

            if (avg >= threshold) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}