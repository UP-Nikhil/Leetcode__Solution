
//https://leetcode.com/problems/path-sum-ii/description/
import java.util.*;

public class PS_2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        private void helper(TreeNode root, int target, List<List<Integer>> ans, ArrayList<Integer> arr) {
            if (root == null) {
                return;
            }

            if (root != null && (root.left == null && root.right == null)) {
                arr.add(root.val);
                if (root.val == target) {
                    ArrayList<Integer> a = new ArrayList<>();
                    for (int i = 0; i < arr.size(); i++) {
                        a.add(arr.get(i));
                    }
                    ans.add(a);
                }

                arr.remove(arr.size() - 1); // Backtraking;
            }
            arr.add(root.val);
            target -= root.val;

            helper(root.left, target, ans, arr);
            helper(root.right, target, ans, arr);
            arr.remove(arr.size() - 1); // Backtraking;

        }

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> arr = new ArrayList<>();
            helper(root, targetSum, ans, arr);
            return ans;
        }
    }
    public static void main(String[] args) {
        
    }
}
