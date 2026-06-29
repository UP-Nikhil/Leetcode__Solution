//https://leetcode.com/problems/top-k-frequent-elements/description/
import java.util.*;
public class TKFE {
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // for check higher frequency;
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                        (a, b) -> map.get(b) - map.get(a)
                );

        pq.addAll(map.keySet());

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
