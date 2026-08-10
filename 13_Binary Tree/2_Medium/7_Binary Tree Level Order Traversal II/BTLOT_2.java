//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/

import java.util.*;;

public class BTLOT_2 {

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

        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null)
                return ans;

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            while (!q.isEmpty()) {

                int size = q.size();
                List<Integer> arr = new ArrayList<>();

                for (int i = 0; i < size; i++) {

                    TreeNode temp = q.poll();

                    arr.add(temp.val);

                    if (temp.left != null)
                        q.offer(temp.left);

                    if (temp.right != null)
                        q.offer(temp.right);
                }

                ans.add(arr);
            }
            Collections.reverse(ans);
            return ans;

        }
    }

    public static void main(String[] args) {

    }
}
