//https://www.geeksforgeeks.org/problems/permutation-with-spaces3627/1

import java.util.*;

public class PWS {

    public void helper(String s, String current, ArrayList<String> ans) {

        if (s.isEmpty()) {
            ans.add(current);
            return;
        }

        char ch = s.charAt(0);

        helper(s.substring(1), current + " " + ch, ans);
        helper(s.substring(1), current + ch, ans);
    }

    public ArrayList<String> permutation(String s) {

        ArrayList<String> ans = new ArrayList<>();

        helper(s.substring(1), "" + s.charAt(0), ans);

        return ans;
    }

    public static void main(String[] args) {

    }
}
