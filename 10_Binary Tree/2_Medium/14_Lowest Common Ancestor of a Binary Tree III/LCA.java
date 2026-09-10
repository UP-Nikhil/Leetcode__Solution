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

    public static void main(String[] args) {

        LCA tree = new LCA();

        // Nodes create
        Node root = tree.new Node(3);
        Node p = tree.new Node(5);
        Node q = tree.new Node(1);
        Node node2 = tree.new Node(2);
        Node node4 = tree.new Node(4);

        // Tree connect
        root.left = p;
        root.right = q;

        p.parent = root;
        q.parent = root;

        p.right = node2;
        node2.parent = p;

        node2.right = node4;
        node4.parent = node2;

        /*
                 3
                / \
               5   1
                \
                 2
                  \
                   4

             p = 5
             q = 4
         */
        Node result = tree.lowestCommonAncestor(p, node4);

        System.out.println("LCA = " + result.val);
    }
}
