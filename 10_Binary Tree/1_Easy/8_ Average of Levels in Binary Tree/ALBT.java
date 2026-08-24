//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

import java.util.*;

public class ALBT {

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

        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> ans = new ArrayList<>();
            if (root == null)
                return ans;

            Queue<TreeNode> q = new LinkedList<>();
            if (root != null)
                q.add(root);
            while (!q.isEmpty()) {

                int size = q.size();
                double sum = 0;

                for (int i = 0; i < size; i++) {

                    TreeNode temp = q.remove();

                    sum += temp.val;

                    if (temp.left != null) {
                        q.add(temp.left);
                    }

                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                }

                double avg = sum / size;
                ans.add(avg);
            }
            return ans;
        }
    }

    public static void main(String[] args) {

    }

}
