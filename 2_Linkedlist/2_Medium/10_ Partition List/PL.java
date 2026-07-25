//https://leetcode.com/problems/partition-list/description/

public class PL {
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

    public ListNode partition(ListNode head, int x) {
        ListNode dummy_1 = new ListNode(0);
        ListNode dummy_2 = new ListNode(0);

        ListNode t1 = head;
        t1 = dummy_1;
        ListNode t2 = head;
        t2 = dummy_2;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
                t1.next = temp;
                t1 = t1.next;
            } else {
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;
        }

        t2.next = null;

        t1.next = dummy_2.next;

        return dummy_1.next;

    }
    public static void main(String[] args) {
        
    }
}
