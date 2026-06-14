//(https://leetcode.com/problems/running-sum-of-1d-array/description/
import java.util.*;

public class Soluton {
    public static int[] intSum(int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(intSum(arr)));

    }
}
