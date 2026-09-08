//https://leetcode.com/problems/merge-sorted-array/description/

import java.util.Arrays;

public class MSA_1 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;

        int ans[] = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k] = nums1[i];
                i++;
            } else {
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }
        // pahle me jo bacha ho
        while (i < m) {
            ans[k] = nums1[i];
            k++;
            i++;
        }

        // dusre me jo bacha ho
        while (j < n) {
            ans[k] = nums2[j];
            k++;
            j++;
        }

        // copy to nums1

        for (int u = 0; u < nums1.length; u++) {
            nums1[u] = ans[u];
        }
        return nums1;
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;

       System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));

    }
}