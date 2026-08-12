
//https://leetcode.com/problems/binary-tree-postorder-traversal/description/
import java.util.*;

public class Postorder {
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

        static void postorder(TreeNode root, List<Integer> ans) {
            if (root == null)
                return;
            postorder(root.left, ans);
            postorder(root.right, ans);
            ans.add(root.val);

        }

        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            postorder(root, ans);
            return ans;
        }
    }

    public static void main(String[] args) {

    }
}
