//https://www.geeksforgeeks.org/problems/sorted-insert-for-circular-linked-list/1

public class ISCLL {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public Node sortedInsert(Node head, int data) {
        // case 1
        if (head == null) {
            Node node = new Node(data);
            node.next = node;
            return node;
        }

        // case 2
        if (data <= head.data) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            Node node = new Node(data);
            temp.next = node;
            node.next = head;
            return node;

        }
        // case 3
        Node temp = head;
        while (temp.next != head && temp.next.data < data) {
            temp = temp.next;
        }
        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;

        return head;

    }

    public static  void main(String args []){

    }
}

