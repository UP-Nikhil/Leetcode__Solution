//https://leetcode.com/problems/the-number-of-the-smallest-unoccupied-chair/description/

import java.util.*;
public class NSU {
    
    /*
    // brute force;
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
    
        int tergetArrival = times[targetFriend][0];
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
    
        int chair[] = new int[n];
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n; j++) {
                if (times[i][0] >= chair[j]) {
    
                    if (tergetArrival == times[i][0]) {
                        return j;
                    }
                    chair[j] = times[i][1];
                    break;
    
                }
            }
        }
        return -1;
    
    }
    
    */

    public int smallestChair(int[][] times, int targetFriend) {

        int n = times.length;
        int targetArrival = times[targetFriend][0];

        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> available = new PriorityQueue<>();
        PriorityQueue<int[]> occupied = new PriorityQueue<>(
                (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            available.offer(i);
        }

        for (int i = 0; i < n; i++) {
            int at = times[i][0];

            while (!occupied.isEmpty() && at >= occupied.peek()[0]) {
                int[] chair = occupied.poll();
                available.offer(chair[1]);
            }

            int c = available.poll();

            if (targetArrival == at) {
                return c;
            }

            occupied.offer(new int[] { times[i][1], c });
        }

        return -1;
    }
    public static void main(String[] args) {
        
    }

}
