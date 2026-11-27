//https://leetcode.com/problems/combinations/description/

import java.util.*;
public class Com {
    

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(1, n, k, current, result);
        return result;
    }

    private void helper(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
      
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

      
        int needed = k - current.size();
        for (int i = start; i <= n - needed + 1; i++) {
            current.add(i); // Choose
            helper(i + 1, n, k, current, result); // Explore
            current.remove(current.size() - 1); // Unchoose (Backtrack)
        }
    }
    public static void main(String[] args) {
        
    }

}
