// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
import java.util.*;
public class KLE {
    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {

            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
    
    public static void main(String[] args) {
        int arr[] ={ 4,2,1,10,35,5,6,7};
        int  ans = findKthLargest(arr,2);
        System.out.println(ans);
    }
}
