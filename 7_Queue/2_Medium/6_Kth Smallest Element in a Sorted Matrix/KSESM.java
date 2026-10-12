//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/


import java.util.*;

public class KSESM {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            pq.offer(new int[] { matrix[i][0], i, 0 });
        }

        // Remove k-1 smallest elements
        for (int i = 0; i < k - 1; i++) {
            int[] curr = pq.poll();

            int row = curr[1];
            int col = curr[2];

            if (col + 1 < n) {
                pq.offer(new int[] {
                        matrix[row][col + 1],
                        row,
                        col + 1
                });
            }
        }

        return pq.poll()[0];
    }
    public static void main(String args[]){

    }
}