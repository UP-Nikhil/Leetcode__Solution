
public class Mearge {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode L1 = list1;
        ListNode L2 = list2;
        ListNode node = new ListNode(0);
        ListNode temp = node;

        while (L1 != null && L2 != null) {
            if (L1.val < L2.val) {
                temp.next = L1;
                L1 = L1.next;
            } else {
                temp.next = L2;
                L2 = L2.next;
            }
            temp = temp.next;
        }
        if (L1 == null) {
            temp.next = L2;
        } else {
            temp.next = L1;
        }
        return node.next;

    }
}
