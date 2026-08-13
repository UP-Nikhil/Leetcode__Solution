//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

public class SRLN {
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

        private int helper(TreeNode root, int n) {
            if (root == null)
                return 0;
            n = n * 10 + root.val;

            if (root.left == null && root.right == null) {
                return n;
            }
            return helper(root.left, n) + helper(root.right, n);

        }

        public int sumNumbers(TreeNode root) {
            if (root == null)
                return 0;
            return helper(root, 0);
        }
    }
    public static void main(String[] args) {
        
    }
}
