//https://leetcode.com/problems/k-closest-points-to-origin/description/

import java.util.*;

public class KCPO {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<double[]> q = new PriorityQueue<>(
            (double[] a, double[] b) -> Double.compare(b[1], a[1]));

        for (int i = 0; i < points.length; i++) {
            int point[] = points[i];

            double first = Math.pow(point[0], 2);
            double second = Math.pow(point[1], 2);

            double dis = Math.sqrt(first + second);

            q.offer(new double[] { i, dis });

            if (q.size() > k) {
                q.poll();
            }
        }

        int ans[][] = new int[k][2];

        for (int i = 0; i < k; i++) {
            int index = (int) q.poll()[0];
            ans[i] = points[index];
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}