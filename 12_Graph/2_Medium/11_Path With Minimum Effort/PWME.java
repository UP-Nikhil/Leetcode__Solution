//https://leetcode.com/problems/path-with-minimum-effort/description/

import java.util.*;
public class PWME {

    static class triplet {
        int row;
        int col;
        int effort;

        public triplet(int row, int col, int effort) {
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
    }

    public int minimumEffortPath(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[][] dist = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        dist[0][0] = 0;

        PriorityQueue<triplet> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.effort, b.effort));

        pq.offer(new triplet(0, 0, 0));

        while (!pq.isEmpty()) {

            triplet top = pq.poll();

            int row = top.row;
            int col = top.col;
            int effort = top.effort;

            if (row == m - 1 && col == n - 1)
                return effort;

            // UP
            if (row > 0) {
                int e = Math.abs(arr[row][col] - arr[row - 1][col]);
                e = Math.max(e, effort);

                if (e < dist[row - 1][col]) {
                    dist[row - 1][col] = e;
                    pq.offer(new triplet(row - 1, col, e));
                }
            }

            // LEFT
            if (col > 0) {
                int e = Math.abs(arr[row][col] - arr[row][col - 1]);
                e = Math.max(e, effort);

                if (e < dist[row][col - 1]) {
                    dist[row][col - 1] = e;
                    pq.offer(new triplet(row, col - 1, e));
                }
            }

            // RIGHT
            if (col < n - 1) {
                int e = Math.abs(arr[row][col] - arr[row][col + 1]);
                e = Math.max(e, effort);

                if (e < dist[row][col + 1]) {
                    dist[row][col + 1] = e;
                    pq.offer(new triplet(row, col + 1, e));
                }
            }

            // DOWN
            if (row < m - 1) {
                int e = Math.abs(arr[row][col] - arr[row + 1][col]);
                e = Math.max(e, effort);

                if (e < dist[row + 1][col]) {
                    dist[row + 1][col] = e;
                    pq.offer(new triplet(row + 1, col, e));
                }
            }
        }

        return dist[m - 1][n - 1];
    }
    public static void main(String[] args) {
        
    }
}