//https://leetcode.com/problems/merge-intervals/description/

import java.util.*;

public class MI {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();

        int current[] = intervals[0];
        list.add(current);

        for (int i = 1; i < intervals.length; i++) {
            int currEnd = current[1];
            int nextSt = intervals[i][0];
            int nextEn = intervals[i][1];

            if (currEnd >= nextSt) {
                current[1] = Math.max(currEnd, nextEn);
            } else {
                current = intervals[i];
                list.add(current);
            }
        }

        int[][] ans = new int[list.size()][];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;

    }

    public static void main(String args[]) {

    }
}