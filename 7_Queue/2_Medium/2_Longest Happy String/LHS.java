//https://leetcode.com/problems/longest-happy-string/description/

import java.util.*;
 public class LHS {

    class pair {
        char s;
        int val;

        pair(char s, int val) {
            this.s = s;
            this.val = val;
        }
    }

    public String longestDiverseString(int a, int b, int c) {

        PriorityQueue<pair> q = new PriorityQueue<>(
                (x, y) -> Integer.compare(y.val, x.val));

        if (a > 0)
            q.add(new pair('a', a));

        if (b > 0)
            q.add(new pair('b', b));

        if (c > 0)
            q.add(new pair('c', c));

        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {

            pair max = q.poll();

            if (ans.length() >= 2 && ans.charAt(ans.length() - 1) == max.s &&
                    ans.charAt(ans.length() - 2) == max.s) {

                if (q.isEmpty())
                    break;

                pair second = q.poll();

                ans.append(second.s);
                second.val--;

                if (second.val > 0)
                    q.add(second);

                q.add(max);

            } else {

                ans.append(max.s);
                max.val--;

                if (max.val > 0)
                    q.add(max);
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        
    }
}