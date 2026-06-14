//https://leetcode.com/problems/shuffle-the-array/
import java.util.*;

public class Shuffle {
    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2 * n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            arr[idx++] = nums[i];
            arr[idx++] = nums[i + n];

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
}
// [2,5,1,3,4,7], n = 3
//output [2,3,5,4,1,7] 
