class Solution {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


        public static ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode temp = new ListNode(0);
            temp.next = head;

            ListNode slow = temp;
            ListNode fast = temp;

            for (int i = 0; i <= n; i++) {
                fast = fast.next;
            }

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;

            return temp.next;
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

        removeNthFromEnd(a, 2);

        ListNode temp = a;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}