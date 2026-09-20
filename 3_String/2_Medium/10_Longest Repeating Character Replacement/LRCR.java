//https://leetcode.com/problems/longest-repeating-character-replacement/description/

public class LRCR {

    // Using Dynamic Sliding window;
    public int characterReplacement(String s, int k) {
        int max = 0;
        int i = 0, j = 0;

        int maxC = 0;
        int fq[] = new int[26];

        while (j < s.length()) {

            char ch = s.charAt(j);
            fq[ch - 'A'] = fq[ch - 'A'] + 1;
            maxC = Math.max(maxC, fq[ch - 'A']);

            while ((j - i + 1) - maxC > k) {
                char c = s.charAt(i);
                fq[c - 'A'] = fq[c - 'A'] - 1;
                i++;
            }

            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }

    public static void main(String[] args) {

    }
}