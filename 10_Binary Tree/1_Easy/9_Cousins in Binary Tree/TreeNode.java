//https://leetcode.com/problems/cousins-in-binary-tree/description/

import java.util.*;
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

    public class CBT {
        public boolean isCousins(TreeNode root, int x, int y) {

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            while (!q.isEmpty()) {

                int size = q.size();

                TreeNode X = null;
                TreeNode Y = null;

                for (int i = 0; i < size; i++) {

                    TreeNode curr = q.poll();

                    if (curr.left != null) {

                        if (curr.left.val == x) {
                            X = curr;
                        }

                        if (curr.left.val == y) {
                            Y = curr;
                        }

                        q.offer(curr.left);
                    }
                    if (curr.right != null) {

                        if (curr.right.val == x) {
                            X = curr;
                        }

                        if (curr.right.val == y) {
                            Y = curr;
                        }

                        q.offer(curr.right);
                    }
                }
                // agar mil gy dono parrent
                if (X != null && Y != null) {
                    return X != Y;
                }
                // ek mila and ek nahi mila;
                if (X != null || Y != null) {
                    return false;
                }
            }

            return false;
        }
    }
    public static void main(String[] args) {
        
    }
}
