//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-iii/

//https://neetcode.io/problems/lowest-common-ancestor-of-a-binary-tree-iii/question
import java.util.*;

public class LCA {

    class Node {

        public int val;
        public Node left;
        public Node right;
        public Node parent;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node lowestCommonAncestor(Node p, Node q) {

        // Step 1: p ke ancestors HashSet mein store karo
        HashSet<Node> set = new HashSet<>();

        while (p != null) {
            set.add(p);
            p = p.parent;
        }

        // Step 2: q se parent ki taraf jao
        while (q != null) {

            if (set.contains(q)) {
                return q;
            }

            q = q.parent;
        }

        return null;
    }
/* 
    public Node lowestCommonAncestor_1(Node p, Node q) {

        Node a = p;
        Node b = q;

        while (a != b) {

            if (a == null) {
                a = q;
            } else {
                a = a.parent;
            }

            if (b == null) {
                b = p;
            } else {
                b = b.parent;
            }
        }

        return a;
    } */
}
