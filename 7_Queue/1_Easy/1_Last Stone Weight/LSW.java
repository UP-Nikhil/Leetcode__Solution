//https://leetcode.com/problems/last-stone-weight/description/

import java.util.*;
public class LSW {
    
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int n : stones) {
            q.offer(n);
        }

        while (q.size() > 1) {
            int first = q.poll();
            int second = q.poll();

            if (second < first) {
                q.offer(first - second);
            }

        }

        if (q.size() == 1) {
            return q.poll();
        }
        
        return 0;
    }
    public static void main(String[] args) {
        
    }
}

