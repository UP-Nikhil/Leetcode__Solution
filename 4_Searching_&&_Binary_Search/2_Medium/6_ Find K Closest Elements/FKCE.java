//https://leetcode.com/problems/find-k-closest-elements/description/

import java.util.*;
public class FKCE {
    

    // My Thinking 
    /*
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
    
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> {
            int da = Math.abs(a - x);
            int db = Math.abs(b - x);
    
            if (da != db) {
                return Integer.compare(db, da);
            }
            return Integer.compare(b, a);
        });
    
        for (int num : arr) {
            q.offer(num);
    
            if (q.size() > k) {
                q.poll();
            }
        }
    
        while(!q.isEmpty()) {
            list.add(q.poll());
        }
    
        Collections.sort(list);
        return list;
    }
    */

    public List<Integer> findClosestElements( int[] arr, int k, int x) {

        int left = 0;
        int right = arr.length - k;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = left; i < left + k; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }

}

