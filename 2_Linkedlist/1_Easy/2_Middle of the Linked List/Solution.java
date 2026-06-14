class Solution {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(5);
        ListNode b = new ListNode(6);
        ListNode c = new ListNode(7);
        ListNode d = new ListNode(8);
        ListNode e = new ListNode(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}