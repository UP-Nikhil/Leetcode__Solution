// Ask in Google;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class LOSN {
    public static TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }

            if (currentNode.val == key) {
                break;
            }
        }

        return queue.peek();
    }

    // 2. टेस्ट करने के लिए main मेथड
    public static void main(String[] args) {
        /*
         ये एक सैंपल ट्री बनाएगा:
                1
               / \
              2   3
             / \
            4   5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int searchKey = 3; // हम 3 का अगला (successor) ढूंढ रहे हैं
        TreeNode result = findSuccessor(root, searchKey);

        if (result != null) {
            System.out.println(searchKey + " Successor  " + result.val);
        } else {
            System.out.println(searchKey + " Successor not availabel ");
        }
    }
}
