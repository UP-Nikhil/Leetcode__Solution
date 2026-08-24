//https://leetcode.com/problems/balanced-binary-tree/description/

public class BBT {

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
    }

    private int heigth(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(heigth(root.left), heigth(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int l = heigth(root.left);
        if (root.left != null)
            l++;
        int r = heigth(root.right);
        if (root.right != null)
            r++;
        int diff = Math.abs(l - r);

        if (diff > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static void main(String args[]){
        
    }
}
