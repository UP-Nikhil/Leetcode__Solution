//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

public class PNRP {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }

        public Node connect(Node root) {

            if (root == null)
                return null;
            Node lm = root;

            while (lm.left != null) {
                Node c = lm;
                while (c != null) {
                    c.left.next = c.right;
                    if (c.next != null) {
                        c.right.next = c.next.left;
                    }
                    c = c.next;
                }
                lm = lm.left;
            }

            return root;
        }

    }
    public static void main(String[] args) {
        
    }
}