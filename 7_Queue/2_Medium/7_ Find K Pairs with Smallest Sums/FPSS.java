//https://leetcode.com/problems/find-k-pairs-with-smallest-sums/description/

import java.util.*;

public class FPSS {
    


    /*
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    
        List<List<Integer>> ans = new ArrayList<>();
    
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return ans;
        }
    
        PriorityQueue<int[]> q = new PriorityQueue<>(
                (a, b) -> Integer.compare(a[2], b[2]));
    
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                q.add(new int[] {
                        nums1[i],
                        nums2[j],
                        nums1[i] + nums2[j]
                });
            }
        }
    
        while (k > 0 && !q.isEmpty()) {
            int[] current = q.poll();
    
            List<Integer> list = new ArrayList<>();
            list.add(current[0]);
            list.add(current[1]);
    
            ans.add(list);
            k--;
        }
    
        return ans;
    }
    
    */
 
    // second approach;
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> ans = new ArrayList<>();

        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return ans;
        }

        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            q.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }

        while (k > 0 && !q.isEmpty()) {
            int[] current = q.poll();

            int i = current[1];
            int j = current[2];

            ans.add(Arrays.asList(nums1[i], nums2[j]));

            if (j + 1 < nums2.length) {
                q.offer(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
            }

            k--;
        }


        return ans;
    }
    public static void main(String[] args) {
        
    }

}

