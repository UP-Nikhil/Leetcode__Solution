//https://leetcode.com/problems/remove-covered-intervals/description/

import java.util.*;
import javax.lang.model.type.ArrayType;

public class RCI {

    // brute force;
    /*
     * TC = 0(n^2)
     * SC = 0(1);
     * public int removeCoveredIntervals(int[][] intervals) {
     * int count = 0;
     * 
     * for (int i = 0; i < intervals.length; i++) {
     * int c = intervals[i][0],
     * d = intervals[i][1];
     * boolean isCovered = false;
     * for (int j = 0; j < intervals.length; j++) {
     * int a = intervals[j][0],
     * b = intervals[j][1];
     * 
     * if (i != j && (a <= c && b >= d)) {
     * isCovered = true;
     * break;
     * }
     * }
     * 
     * if (!isCovered) {
     * count++;
     * }
     * }
     * return count;
     * }
     */
    // time complexcity 0(n log(n)) ; SC = 0(1);
    public static int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {

            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }

        });

        int count = 1,
                max = intervals[0][1];

        for (int[] interval : intervals) {
            if (interval[1] > max) {
                count++;
                max = Math.max(max, interval[1]);
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 4 },
                { 3, 6 },
                { 2, 8 }

        };
        // for (int[] row : arr) {
        // System.out.println(Arrays.toString(row));
        // }

        System.out.println(Arrays.deepToString(arr) + " ");
        System.out.println(removeCoveredIntervals(arr));
    }
}