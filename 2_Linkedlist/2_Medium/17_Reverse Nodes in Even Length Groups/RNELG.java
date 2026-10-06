//https://leetcode.com/problems/reverse-nodes-in-even-length-groups/description/

public class RNELG {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode runner = dummy;
        int groupLen = 1;

        while (runner.next != null) {
            ListNode temp = runner.next;
            int count = 0;

            while (temp != null && count < groupLen) {
                temp = temp.next;
                count++;
            }

            if (count % 2 == 0) {
                ListNode curr = runner.next;
                ListNode prev = temp;

                for (int i = 0; i < count; i++) {
                    ListNode nextNode = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = nextNode;
                }

                ListNode tail = runner.next;
                runner.next = prev;
                runner = tail;
            }

            else {
                for (int i = 0; i < count; i++) {
                    runner = runner.next;
                }
            }
            groupLen++;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        
    }
}

