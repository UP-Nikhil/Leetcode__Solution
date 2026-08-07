//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

import java.util.*;

class Solution {

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

        // Computes the height of the tree
        public static int height(TreeNode root) {
            if (root == null || (root.left == null && root.right == null)) {
                return 0;
            }
            return 1 + Math.max(height(root.left), height(root.right));
        }

        // the n-th level from left to right
        public void nthLevel(TreeNode root, int n, List<Integer> arr) {
            if (root == null)
                return;
            if (n == 1) {
                arr.add(root.val);
                return;
            }
            nthLevel(root.left, n - 1, arr);
            nthLevel(root.right, n - 1, arr);
        }

        // the n-th level from right to left
        public void nthLevel2(TreeNode root, int n, List<Integer> arr) {
            if (root == null)
                return;
            if (n == 1) {
                arr.add(root.val);
                return;
            }
            nthLevel2(root.right, n - 1, arr);
            nthLevel2(root.left, n - 1, arr);
        }

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            int h = height(root) + 1;
            List<List<Integer>> ans = new ArrayList<>();

            if (root == null)
                return ans;

            for (int i = 1; i <= h; i++) {
                List<Integer> arr = new ArrayList<>();
                if (i % 2 != 0)
                    nthLevel(root, i, arr);
                else
                    nthLevel2(root, i, arr);

                ans.add(arr);
            }
            return ans;

        }

        public static void main(String args[]) {

        }
    }
}