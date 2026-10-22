//https://leetcode.com/problems/choose-k-elements-with-maximum-sum/description/
import java.util.*;

public class CEWM {

    /*
    // Brute force 
    
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
    
        int n = nums1.length;
        long arr[] = new long[n];
    
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
    
            for (int j = 0; j < n; j++) {
                if (nums1[j] < nums1[i]) {
                    list.add(nums2[j]);
                }
            }
    
            Collections.sort(list);
    
            long sum = 0;
    
            for (int j = 0; j < Math.min(k, list.size()); j++) {
                sum += (long)list.get(list.size() - j - 1);
            }
    
            arr[i] = sum;
        }
        return arr;
    }
    
    
    
    // Second approach;
    
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        long arr[] = new long[n];
    
        for (int i = 0; i < n; i++) {
            PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    
            for (int j = 0; j < n; j++) {
                if (nums1[j] < nums1[i]) {
                    q.add(nums2[j]);
                }
            }
    
            long sum = 0,
                x = k;
    
            while (!q.isEmpty() && x > 0) {
                sum += (long) q.poll();
                x--;
            }
    
            arr[i] = sum;
        }
        return arr;
    }
    */

    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        long arr[] = new long[n];

        int ds[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            ds[i][0] = nums1[i];
            ds[i][1] = nums2[i];
            ds[i][2] = i;
        }

        Arrays.sort(ds, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> q = new PriorityQueue<>();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int idx = ds[i][2];

           
            if (i > 0 && ds[i][0] == ds[i - 1][0]) {

                arr[idx] = arr[ds[i - 1][2]];
            }
             else {
                arr[idx] = sum;
            }

            int val = ds[i][1];

            if (k == 0) {
                continue;
            }

            if (q.size() < k) {
                
                q.offer(val);
                sum += val;
            }
             else if (val > q.peek()) {
                sum -= q.poll();
                q.offer(val);
                sum += val;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        

        
    }

}