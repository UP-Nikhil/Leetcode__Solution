// https://leetcode.com/problems/rotate-array/description/
import java.util.*;
class RA {
    // brute fource;

    // public static  int[] rotate(int[] arr, int k) {
    //     int n = arr.length;
    //     int[] nums = new int[n];

    //     k = k % n;
    //     int j = 0;

    //     for (int i = n - k; i < n; i++) {
    //         nums[j] = arr[i];
    //         j++;
    //     }

    //     for (int i = 0; i < n - k; i++) {
    //         nums[j] = arr[i];
    //         j++;
    //     }

    //     return nums;
    // }

    public  static void rotate(int[] arr, int k) {
    int n = arr.length;
    k = k % n;

    reverse(arr, 0, n - k - 1);
    reverse(arr, n - k, n - 1);
    reverse(arr, 0, n - 1);
    }

    private static  void reverse(int[] arr, int i, int j) {
    while (i < j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    i++;
    j--;
    }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 5);
        System.out.println(Arrays.toString(arr));
  
    }
}