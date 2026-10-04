//https://leetcode.com/problems/reverse-nodes-in-k-group/description/

public class RNG {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int noRev = len / k;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        temp = head;
        ListNode prevGroup = dummy;

        for (int i = 0; i < noRev; i++) {

            ListNode curr = temp;
            ListNode prev = null;

            for (int j = 0; j < k; j++) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = null;

            ListNode ext = new ListNode(0);
            ext.next = reverse(temp);

            ListNode temp1 = ext;

            while (temp1.next != null) {
                temp1 = temp1.next;
            }

            prevGroup.next = ext.next;

            temp1.next = curr;

            prevGroup = temp1;
            temp = curr;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        
    }
}
