//https://leetcode.com/problems/find-right-interval/description/

import java.util.*;
public class FRI {
   
    /*
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int arr[] = new int[n];
    
        for (int i = 0; i < n; i++) {
           int index = -1;
            int minStart = Integer.MAX_VALUE;
    
            for (int j = 0; j < n; j++) {
                if (intervals[j][0] >= intervals[i][1]  && intervals[j][0] < minStart) {
                   
                        minStart = intervals[j][0];
                        index = j;
                    
                }
            }
    
            arr[i] = index;
        }
        return arr;
    }
    */

    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;

        PriorityQueue<int[]> minSt = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<int[]> minEnd = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = -1;
            minSt.offer(new int[] { intervals[i][0], i });
            minEnd.offer(new int[] { intervals[i][1], i });
        }

        while (!minSt.isEmpty() && !minEnd.isEmpty()) {
            int stpoint[] = minSt.peek();
            int st = stpoint[0];
            int stIdx = stpoint[1];

            if (st >= minEnd.peek()[0]) {
                res[minEnd.peek()[1]] = stIdx;
                minEnd.poll();
            } else {
                minSt.poll();
            }
        }

        return res;
    }

    
    public static void main(String[] args) {
        
    }

}
