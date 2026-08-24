
//https://leetcode.com/problems/binary-tree-right-side-view/description/
import java.util.*;

public class BTRSV {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            if (root == null)
                return ans;

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while (q.size() > 0) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = q.poll();
                    if (i == size - 1) {
                        ans.add(temp.val);
                    }
                    if (temp.left != null) {
                        q.offer(temp.left);
                    }
                    if (temp.right != null) {
                        q.offer(temp.right);
                    }
                }
            }
            return ans;

        }

    }
    public static void main(String[] args) {

    }
}
