//https://leetcode.com/problems/letter-case-permutation/description/

import java.util.*;
public class LCP {
    public void helper(String s, String current, List<String> ans) {
        // Base case
        if (s.isEmpty()) {
            ans.add(current);
            return;
        }

        char ch = s.charAt(0);
        if (!Character.isDigit(ch)) {
            helper(s.substring(1), current + Character.toUpperCase(ch), ans);
            helper(s.substring(1), current + Character.toLowerCase(ch), ans);
        } else {
            helper(s.substring(1), current + ch, ans);
        }
    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();

        helper(s, "", ans);
        return ans;
    }

    public static void main(String[] args) {

    }
}
