//https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

public class KSEB {
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
         * private void helper(TreeNode root, PriorityQueue<Integer> q) {
         * 
         * if (root == null)
         * return;
         * 
         * q.add(root.val);
         * 
         * helper(root.left, q);
         * helper(root.right, q);
         * }
         * 
         * public int kthSmallest(TreeNode root, int k) {
         * 
         * PriorityQueue<Integer> pq = new PriorityQueue<>();
         * 
         * helper(root, pq);
         * 
         * for (int i = 0; i < k - 1; i++) {
         * pq.poll();
         * }
         * 
         * return pq.poll();
         * }
         */
        int count = 0;
        int ans = 0;

        private void helper(TreeNode root, int k) {
            if (root == null)
                return;
            helper(root.left, k);
            count += 1;
            if (count == k) {
                ans = root.val;
                return;
            }
            helper(root.right, k);
        }

        public int kthSmallest(TreeNode root, int k) {
            count = 0;
            ans = 0;
            helper(root, k);
            return ans;
        }
    }
    public static void main(String[] args) {
        
    }
}
