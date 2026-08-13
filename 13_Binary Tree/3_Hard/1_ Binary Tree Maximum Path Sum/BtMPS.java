//https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
/**
 * BtMPS
 */
public class BtMPS {

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

        int max = Integer.MIN_VALUE;

        private int helper(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = helper(root.left);
            int right = helper(root.right);

            left = Math.max(0, left);
            right = Math.max(0, right);

            int sum = root.val + left + right;
            max = Math.max(max, sum);

            return Math.max(left, right) + root.val;
        }

        public int maxPathSum(TreeNode root) {

            max = Integer.MIN_VALUE;
            helper(root);
            return max;

        }
    }
    public static void main(String[] args) {
        
    }
}