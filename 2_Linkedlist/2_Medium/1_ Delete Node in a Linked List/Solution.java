class Solution {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String args[]) {

        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Solution obj = new Solution();
        obj.deleteNode(c); // delete 7

        Node temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}