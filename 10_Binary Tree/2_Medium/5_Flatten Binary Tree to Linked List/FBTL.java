//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

class FTBL {
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

        /*
         * static TreeNode temp =null;
         * private void helper(TreeNode root){
         * if(root == null) return;
         * TreeNode left = root.left;
         * TreeNode right = root.right;
         * if(temp != null) {
         * temp.left = null;
         * temp.right = root;
         * }
         * temp = root;
         * helper (left);
         * helper(right);
         * 
         * }
         * public void flatten(TreeNode root) {
         * helper(root);
         * }
         * 
         */

        // Spacecomplexcity 0(1);
        public void flatten(TreeNode root) {

            if (root == null)
                return;

            TreeNode temp = root;
            while (temp != null) {

                if (temp.left != null) {
                    TreeNode p = temp.left;
                    while (p.right != null) {
                        p = p.right;
                    }
                    p.right = temp.right;
                    temp.right = temp.left;
                    temp.left = null;
                }
                temp = temp.right;
            }

        }
    }
    public static void main(String[] args) {
        
    }
}