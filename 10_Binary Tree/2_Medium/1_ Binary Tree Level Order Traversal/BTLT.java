
//https://leetcode.com/problems/binary-tree-level-order-traversal/description/

import java.util.*;
class BTLT {
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




//      public static int height(TreeNode root) {
//         if (root == null || (root.left == null && root.right == null)) {
//             return 0;
//         }
//         return 1 + Math.max(height(root.left), height(root.right));
//     }

//   //  the n-th level from left to right
//     public void nthLevel(TreeNode root, int n, List<Integer> arr) {
//         if (root == null) return;
//         if (n == 1) {
//             arr.add(root.val);
//             return;
//         }
//         nthLevel(root.left, n - 1, arr);
//         nthLevel(root.right, n - 1, arr);
//     }

    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     int h = height(root) +1;
    //     List<List<Integer>> ans = new ArrayList<>();

    //     if(root == null) return ans;

    //     for(int i = 1; i <= h; i++){
    //         List<Integer> arr = new ArrayList<>();
    //         BFS_Q(root,arr);
    //         ans.add(arr);
    //     }
    //     return ans;
    // }


   /*
     public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

       Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode temp = q.poll();

                arr.add(temp.val);

                if (temp.left != null)
                    q.offer(temp.left);d

                if (temp.right != null)
                    q.offer(temp.right);
            }

            ans.add(arr);
        }

        return ans;
    }
    */

    // using dfs traversal;
     public void dfs(TreeNode root, int level, List<List<Integer>> ans) {

        if (root == null)
            return;

        if (level == ans.size())
            ans.add(new ArrayList<>());

        ans.get(level).add(root.val);

        dfs(root.left, level + 1, ans);
        dfs(root.right, level + 1, ans);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, 0, ans);

        return ans;
    }

}
class Solution {
//      public static int height(TreeNode root) {
//         if (root == null || (root.left == null && root.right == null)) {
//             return 0;
//         }
//         return 1 + Math.max(height(root.left), height(root.right));
//     }

//   //  the n-th level from left to right
//     public void nthLevel(TreeNode root, int n, List<Integer> arr) {
//         if (root == null) return;
//         if (n == 1) {
//             arr.add(root.val);
//             return;
//         }
//         nthLevel(root.left, n - 1, arr);
//         nthLevel(root.right, n - 1, arr);
//     }

    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     int h = height(root) +1;
    //     List<List<Integer>> ans = new ArrayList<>();

    //     if(root == null) return ans;

    //     for(int i = 1; i <= h; i++){
    //         List<Integer> arr = new ArrayList<>();
    //         BFS_Q(root,arr);
    //         ans.add(arr);
    //     }
    //     return ans;
    // }


   /*
     public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

       Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode temp = q.poll();

                arr.add(temp.val);

                if (temp.left != null)
                    q.offer(temp.left);d

                if (temp.right != null)
                    q.offer(temp.right);
            }

            ans.add(arr);
        }

        return ans;
    }
    */

    // using dfs traversal;
     public void dfs(TreeNode root, int level, List<List<Integer>> ans) {

        if (root == null)
            return;

        if (level == ans.size())
            ans.add(new ArrayList<>());

        ans.get(level).add(root.val);

        dfs(root.left, level + 1, ans);
        dfs(root.right, level + 1, ans);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, 0, ans);

        return ans;
    }

    public static void main(String args[]){

    }

}
}