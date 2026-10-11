//https://leetcode.com/problems/ipo/description/

import java.util.*;
public class IPO {
    

    // bruteforce

    /*
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
    
        List<Integer> cpl = new ArrayList<>();
        List<Integer> prt = new ArrayList<>();
    
        for (int i = 0; i < profits.length; i++) {
            cpl.add(capital[i]);
            prt.add(profits[i]);
        }
    
        for (int i = 0; i < k; i++) {
            int index = -1;
            int maxpt = -1;
    
            for (int j = 0; j < cpl.size(); j++) {
    
                if (cpl.get(j) <= w && prt.get(j) > maxpt) {
                    maxpt = prt.get(j);
                    index = j;
                }
            }
    
            if (index > -1) {
                w += prt.get(index);
                cpl.remove(index);
                prt.remove(index);
    
            } else {
                break;
            }
        }
    
        return w;
    }
    
    */

 // my second  approach;
 /*
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        PriorityQueue<int[]> max = new PriorityQueue<>( (a, b) -> Integer.compare(b[1], a[1]) );

        PriorityQueue<int[]> min = new PriorityQueue<>( (a, b) -> Integer.compare(a[0], b[0]) );

        for (int i = 0; i < profits.length; i++) {
            min.offer(new int[] { capital[i], profits[i] });
        }

        for (int i = 0; i < k; i++) {

            while (!min.isEmpty() && min.peek()[0] <= w) {
                max.offer(min.poll());
            }

            if (max.isEmpty()) {
                break;
            }

            w += max.poll()[1];
        }

        return w;
    }

    */

    // third approacha sorting and max heap;

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        int n = profits.length;
        int[][] projects = new int[n][2];

        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }

        Arrays.sort(projects, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> max = new PriorityQueue<>(
            (a, b) -> Integer.compare(b, a)
        );

        int j = 0;

        for (int i = 0; i < k; i++) {

            while (j < n && projects[j][0] <= w) {
                max.offer(projects[j][1]);
                j++;
            }

            if (max.isEmpty()) {
                break;
            }

            w += max.poll();
        }

        return w;
    }

   public static void main(String[] args) {
    
   }
}


