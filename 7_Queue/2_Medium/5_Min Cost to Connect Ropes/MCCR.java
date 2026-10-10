//http://geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

import java.util.*;

public class MCCR {
    public int minCost(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> Integer.compare(a, b));

        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }

        int ans = 0;

        while (q.size() > 1) {
            int first = q.poll(),
                    second = q.poll();
            int curr = first + second;
            ans += curr;
            q.offer(curr);
        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
