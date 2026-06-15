
public class dub2 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode node = dummy;
        ListNode temp = head;

        while (temp != null) {

            if (temp.next != null && temp.val == temp.next.val) {
                // storee dublicate value;
                int value = temp.val;
                // for skiping element, and increse the temp value;
                while (temp != null && temp.val == value) {
                    temp = temp.next;
                }

                node.next = temp;

            } else {

                node = temp;
                temp = temp.next;
            }
        }

        return dummy.next;
    }
}
