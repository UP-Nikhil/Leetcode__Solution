//https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1

public class RLL {

    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node reverse(Node head, Node prev) {
        if (head == null) {
            return prev;
        }

        Node next = head.next;
        head.next = prev;
        prev = head;

        return reverse(next, prev);
    }

    public Node reverseList(Node head) {
        Node prev = null;
        return reverse(head, prev);
    }

    public static void main(String[] args) {

    }
}
