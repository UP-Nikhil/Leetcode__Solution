//https://leetcode.com/problems/maximum-product-after-k-increments/description/

import java.util.*;
public class TMN {
    

    public int thirdMax(int[] nums) {

        PriorityQueue<Integer> q = new PriorityQueue<>();
        HashSet<Integer> visited = new HashSet<>();
        
        for (int num : nums) {
           
            if (visited.contains(num)) {
                continue;
            }
            
            q.offer(num);
            visited.add(num);
            
            
            if (q.size() > 3) {
                int removed = q.poll();
                visited.remove(removed);
            }
        }
        
       
        if (q.size() < 3) {
            while (q.size() > 1) {
                q.poll(); 
            }
        }
        
        return q.peek();
    }
    public static void main(String[] args) {
        
    }
}

