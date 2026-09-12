//https://www.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1
public class SLH {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Pair<A, B> {
        A a;
        B b;

        Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }

    public static  Pair<Node, Node> splitList(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != head && fast.next != head) {

            slow = slow.next;

            fast = fast.next;

            if (fast.next != head) {
                fast = fast.next;
            }
        }

        fast.next = slow.next;
        slow.next = head;

        return new Pair<>(head, fast.next);
    }

    public void printList(Node head) {

        Node curr = head;

        if (head == null) {
            return;
        }

        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);

        System.out.println();
    }

    public static void main(String[] args) {

        SLH obj = new SLH();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;

        Pair<Node, Node> result = SLH.splitList(n1);

        System.out.print("First Half: ");
        obj.printList(result.a);

        System.out.print("Second Half: ");
        obj.printList(result.b);
    }
}