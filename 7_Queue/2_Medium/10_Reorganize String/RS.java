//

import java.util.*;
public class RS {

    /* 
    public String reorganizeString(String s) {
    
        int fq[] = new int[26];
    
        for (int i = 0; i < s.length(); i++) {
            fq[s.charAt(i) - 'a']++;
        }
    
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]) );
    
        for (int i = 0; i < 26; i++) {
            if (fq[i] > 0) {
                q.offer(new int[]{i, fq[i]});
            }
        }
    
        StringBuilder ans = new StringBuilder();
    
        while (!q.isEmpty()) {
            int first[] = q.poll();
    
            char ch = (char) (first[0] + 'a');
    
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ch) {
    
                if (q.isEmpty()) {
                    return "";
                }
    
                int second[] = q.poll();
    
                ans.append((char) (second[0] + 'a'));
                second[1]--;
    
                if (second[1] > 0) {
                    q.offer(second);
                }
    
                q.offer(first);
    
            } else {
                ans.append(ch);
                first[1]--;
    
                if (first[1] > 0) {
                    q.offer(first);
                }
            }
        }
    
        return ans.toString();
    }
    
    */

    //  second 
    public String reorganizeString(String s) {
        int fq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            fq[s.charAt(i) - 'a'] += 1;
        }

        PriorityQueue<int[]> q = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[1], a[1]));

        for (int i = 0; i < 26; i++) {
            if (fq[i] > 0) {
                q.offer(new int[] { i, fq[i] });
            }
        }

        StringBuilder ans = new StringBuilder();

        while (q.size() > 1) {
            int first[] = q.poll();
            int second[] = q.poll();

            ans.append((char) (first[0] + 'a'));
            ans.append((char) (second[0] + 'a'));

            first[1]--;
            second[1]--;

            if (first[1] > 0) {
                q.offer(first);
            }

            if (second[1] > 0) {
                q.offer(second);
            }
        }

        if (!q.isEmpty()) {
            int last[] = q.poll();

            if (last[1] > 1) {
                return "";
            }

            ans.append((char) (last[0] + 'a'));
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        
    }

}


