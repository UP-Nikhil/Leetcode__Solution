//https://leetcode.com/problems/interval-list-intersections/description/

 import java.util.*;
public class ILIS {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();

        int i = 0, j = 0;
        while (i < firstList.length && j < secondList.length) {
            // intersection
            int s1 = firstList[i][0],
                    s2 = secondList[j][0],
                    e1 = firstList[i][1],
                    e2 = secondList[j][1];

            if (e1 >= s2 && e2 >= s1) { // intersection interval formula;
                list.add(new int[] { Math.max(s1, s2),
                        Math.min(e1, e2) });
            }

            if (e1 < e2) {
                i++;
            } else {
                j++;
            }

        }

        // int res[][] = new int[list.size()][2];
        // for (int a = 0; a < list.size(); a++) {
        // res[a] = list.get(a);
        // }
        // return res;
        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {

    }
}