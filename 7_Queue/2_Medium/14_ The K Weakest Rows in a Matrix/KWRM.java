//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/

import java.util.*;
public class KWRM {
   

    // Brute- Fource 

    // My Thinking;
    /*
    public int[] kWeakestRows(int[][] mat, int k) {
    
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]); 
            }
            return Integer.compare(a[0], b[0]); 
        });
    
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            q.offer(new int[] {
                    count,
                    i
            });
        }
    
        int ans[] = new int[k];
        int i = 0;
    
        while (!q.isEmpty() && k > 0) {
            ans[i] = q.poll()[1];
            i++;
            k--;
        }
    
        return ans;
    }
    */

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for (int i = 0; i < mat.length; i++) {
            int count = countSoldiers(mat[i]);
            q.offer(new int[] { count, i });
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = q.poll()[1];
        }

        return ans;
    }

    private int countSoldiers(int[] row) {
        int low = 0;
        int high = row.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
            
   }
}

