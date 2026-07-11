// https://leetcode.com/problems/longest-palindromic-substring/description/
public class LPS {
     private boolean check(String s, int l, int r) {

        while (l < r) {

            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    public String longestPalindrome(String s) {

        String ans = "";

        int n = s.length();

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                if (check(s, i, j)) {

                    String temp = s.substring(i, j + 1);

                    if (temp.length() > ans.length()) {
                        ans = temp;
                    }
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}