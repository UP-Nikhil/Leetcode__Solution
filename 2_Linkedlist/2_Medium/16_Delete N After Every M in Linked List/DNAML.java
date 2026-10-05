//https://www.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1
//https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/

public class DNAML {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void linkDelete(Node head, int n, int m) {

        Node temp = head;

        while (temp != null) {

            Node prev = null;
            int count = 0;
            while (count < m && temp != null) {
                count++;
                prev = temp;
                temp = temp.next;
            }
            count = 0;

            while (count < n && temp != null) {
                count++;
                temp = temp.next;
            }

            prev.next = temp;

        }
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        linkDelete(head, 1, 2);

        display(head);

    }
}
