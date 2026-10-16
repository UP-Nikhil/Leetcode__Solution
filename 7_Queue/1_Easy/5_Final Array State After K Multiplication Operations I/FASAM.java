//Final Array State After K Multiplication Operations I

import java.util.*;

public class FASAM {

    public int[] getFinalState(int[] nums, int k, int multiplier) {

        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for (int i = 0; i < nums.length; i++) {
            q.offer(new int[] {
                    nums[i],
                    i
            });
        }

        while (k > 0) {
            int val[] = q.poll();
            q.offer(new int[] {
                    (val[0] * multiplier),
                    val[1]
            });
            k--;
        }

        while (!q.isEmpty()) {
            int[] val = q.poll();
            nums[val[1]] = val[0];
        }

        return nums;
    }

    public static void main(String[] args) {

    }
}
