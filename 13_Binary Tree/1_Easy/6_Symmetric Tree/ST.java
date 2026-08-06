//https://leetcode.com/problems/symmetric-tree/description/

public class ST {

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

        // check do tree same hai ki nahi;
        private boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null)
                return true;
            if (p == null || q == null)
                return false;
            if (p.val != q.val)
                return false;
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        // kisi tree mirror( reverse ) kar raha hai;
        public TreeNode invertTree(TreeNode root) {
            if (root == null)
                return root;
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }

        public boolean isSymmetric(TreeNode root) {
            TreeNode q = invertTree(root.left);
            return isSameTree(root.right, q);

        }
    }
    public static void main(String[] args) {
        
    }
}